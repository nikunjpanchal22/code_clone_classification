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
public async Task<ActionResult> Create() 
{
    string jsonPostData;
    using (var stream = new StreamReader(Request.Body))
    {
        jsonPostData = await stream.ReadToEndAsync();
    }
    var foo = JsonConvert.DeserializeObject<Dictionary<string, object>>(jsonPostData)["foo"];
    return Ok(new { success = true });
}


