public string ConvertCsvFileToJsonObject (string path) {
    var csv = new List < string [] > ();
    var lines = File.ReadAllLines (path);
    foreach (string line in lines)
        csv.Add (line.Split (','));
    var properties = lines [0].Split (',');
    var listObjResult = new List < Dictionary < string, string > > ();
    for (int i = 1; i < lines.Length; i ++) {
        var objResult = new Dictionary < string, string > ();
        for (int j = 0; j < properties.Length; j ++)
            objResult.Add (properties [j], csv [i] [j]);
        listObjResult.Add (objResult);
    }
    return JsonConvert.SerializeObject (listObjResult);
}




public string ConvertCsvFileToJsonObject (string path) {
    var lines = File.ReadAllLines (path).Select(row => row.Split (',')).ToList();
    var properties = lines [0];
    var listObjResult = from line in lines.Skip(1)
                        let zip = properties.Zip(line,
                                                 (a, b) => new KeyValuePair<string, string> (a, b))
                        select zip.ToDictionary(kv => kv.Key, kv => kv.Value);
    return JsonConvert.SerializeObject (listObjResult);
}


