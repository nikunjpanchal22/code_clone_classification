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
        var lines = File.ReadAllLines(path);
        var headers = lines[0].Split(','); 
        var values = lines.Skip(1).Select(x => x.Split(',').Select(e => e.Trim()).ToArray());
        var serialized = values.Select(v => headers.Zip(v, (h, val) => new {h, val}).ToDictionary(a => a.h, a => a.val)); 
        return  JsonConvert.SerializeObject (serialized);
}


