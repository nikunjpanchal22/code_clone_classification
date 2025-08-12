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


 public string ConvertCsvFileToJsonObject (string path) 
    { 
        var headers = File.ReadLines(path).First().Split(','); 
        var records = File.ReadLines(path)
            .Skip(1)
            .Select(x => x.Split(','));
        var objs = records.Select(line => line.Zip(headers, (v, h) => new {Header = h.Trim(), Value = v.Trim()}).ToDictionary(x => x.Header, x => x.Value))
            .ToList();
        return  JsonConvert.SerializeObject (objs);
}


