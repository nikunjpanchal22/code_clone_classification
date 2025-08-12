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
        var csvdata = File.ReadAllLines(path);
        var headers = csvdata[0].Split(','); 
        
        var jsondata = csvdata.Skip(1).Select(x => x.Split(',').Select((data, index) => new { Key = headers[index], Value = data }).ToDictionary(x => x.Key, y => y.Value));
        return  JsonConvert.SerializeObject (jsondata);
}


