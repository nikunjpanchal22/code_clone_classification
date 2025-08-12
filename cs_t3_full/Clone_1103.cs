[HttpPost] public ActionResult Create () {
    string jsonPostData;
    using (var stream = Request.InputStream)
    {
        stream.Position = 0;
        using (var reader = new System.IO.StreamReader (stream))
        {
            jsonPostData = reader.ReadToEnd ();
        }} var foo = Newtonsoft.Json.JsonConvert.DeserializeObject < IDictionary < string, object > > (jsonPostData) ["foo"];
    return Json (new {success = true});
}


	[HttpPost] 
public ActionResult Create(){
    string jsonInput;
    using(var reader = new System.IO.StreamReader(Request.InputStream)){
        jsonInput = reader.ReadToEnd();
    }
       
    var jsonOutput = JsonConvert.DeserializeObject<Dictionary<string, dynamic>>(jsonInput);
    var foo = jsonOutput["foo"];
   
    return Json(new { success = true}); 
}


