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
    var columns = new List < string[] > ();
    var lines = File.ReadAllLines (path);
    foreach (string line in lines)
        columns.Add (line.Split (','));
    var keys = lines [0].Split (',');
    var objects = new List < Dictionary < string, string > > ();
    for (int i = 1; i < lines.Length; i ++) {
        var objectProps = new Dictionary < string, string > ();
        for (int j = 0; j < keys.Length; j ++)
            objectProps.Add (keys [j], columns [i] [j]);
        objects.Add (objectProps);
    }
    return JsonConvert.SerializeObject (objects);
}
