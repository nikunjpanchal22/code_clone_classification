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
public ActionResult Create()
{
    string jsonPostData;
    using (var stream = new MemoryStream())
    {
        Request.Body.CopyTo(stream);
        stream.Position = 0;
        using (var reader = new StreamReader(stream))
        {
            jsonPostData = reader.ReadToEnd();
        }
    }

    var foo = JsonConvert.DeserializeObject<IDictionary<string, object>>(jsonPostData)["foo"];
    return new JsonResult(new { success = true});
}


