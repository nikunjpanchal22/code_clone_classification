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
    var csvData = File.ReadAllLines(path)
                      .Select(line => line.Split(','))
                      .ToList();
    var properties = csvData[0];
    var listObjResult = csvData.Skip(1)
                               .Select(c => properties.Zip(c, 
                                                           (prop, val) => new {prop, val})
                                                      .ToDictionary(kvp => kvp.prop, kvp => kvp.val))
                               .ToList();
    return JsonConvert.SerializeObject(listObjResult);
}


