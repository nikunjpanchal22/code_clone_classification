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
    var lines = File.ReadLines (path).Select(l => l.Split(',')).ToList();
    var header = lines[0];
    var listJson = lines.Skip(1)
                        .Select(row => header.Zip(row,
                                                  (a, b) => new {a, b})
                                             .ToDictionary( kv => kv.a, kv => kv.b))
                        .ToList();
    return JsonConvert.SerializeObject (listJson);
}


