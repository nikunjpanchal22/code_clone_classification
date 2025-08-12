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
    var lines = File.ReadLines (path).Select(line => line.Split (',')).ToArray();
    var properties = lines.First();
    var listObjResult = lines.Skip(1)
                             .Select(sm => properties.Zip(sm, 
                                                          (a, b) => new KeyValuePair<string, string> (a, b))
                                                     .ToDictionary(kv => kv.Key, kv => kv.Value))
                             .ToList();
    return JsonConvert.SerializeObject (listObjResult);
}


