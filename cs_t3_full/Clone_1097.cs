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
    string jsonString;
    using (StreamReader reader = new StreamReader(Request.InputStream))
    {
        jsonString = reader.ReadToEnd();
    }
   
    var deserializeObject = JsonConvert.DeserializeObject<dynamic>(jsonString);
    var foo = deserializeObject["foo"];
       
    return Json(new { success = true}); 
}


