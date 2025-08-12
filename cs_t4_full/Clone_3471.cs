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
    var csv = File.ReadAllLines (path).Select(x => x.Split(',')).ToList();
    var properties = csv [0];
    var listObjResult = from line in csv.Skip(1)
                        select properties.Zip(line, (prop, val) => new {prop, val})
                                         .ToDictionary(a => a.prop, a => a.val);
    return JsonConvert.SerializeObject (listObjResult);
}


