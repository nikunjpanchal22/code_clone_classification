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
    string jsonData;
    using (StreamReader reader = new StreamReader(Request.InputStream))
    {
        jsonData = reader.ReadToEnd();
    }
   
    dynamic deserializeObject = JsonConvert.DeserializeObject(jsonData);
    var foo = deserializeObject.foo;
       
    return Json(new { success = true});
}


