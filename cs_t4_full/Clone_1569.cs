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
        var lines = File.ReadAllLines(path).Skip(1); 
        var columns = File.ReadLines(path).First().Split(','); 
        var jsonArray = String.Empty; 
        foreach (var line in lines) 
        { 
            var valueItems = line.Split(',');
            var jsonObject = String.Empty; 
            for (int i = 0; i < columns.Length; i++) 
            { 
                var valueItem = valueItems[i]; 
                jsonObject += "\"" + columns[i] + "\": \"" + valueItem.Trim() + "\","; 
            } 
            jsonObject = jsonObject.Substring(0, jsonObject.Length - 1); 
            jsonArray = jsonArray + "{" + jsonObject + "},"; 
        } 
        jsonArray = jsonArray.Substring(0, jsonArray.Length - 1); 
        return  JsonConvert.SerializeObject ("[" + jsonArray + "]");
}


