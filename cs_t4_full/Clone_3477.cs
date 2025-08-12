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
    var lines = File.ReadAllLines (path);
    var header = lines.FirstOrDefault()?.Split(',');
    var dictList = lines.Skip(1)
                        .Select(line => 
                        header.Zip(line.Split(','), (k, v) => new {k, v})
                              .ToDictionary(a => a.k, a => a.v))
                        .ToList();
    return JsonConvert.SerializeObject (dictList);
}


