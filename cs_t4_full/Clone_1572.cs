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
        var fields = File.ReadLines(path).First().Split(','); 
        var results = File.ReadLines(path)
            .Skip(1)
            .Select(x => x.Split(','))
            .Select(x =>
            {
                var jsonObject = new Dictionary<string, string>(); 
                for (int i = 0; i < fields.Length; i++) 
                { 
                    jsonObject.Add(fields[i], x[i]); 
                }
                return jsonObject; 
            });
        return  JsonConvert.SerializeObject (results);
}


