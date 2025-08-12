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
public async Task<IActionResult> Create()
{
    using var streamReader = new StreamReader(Request.Body, Encoding.UTF8);
    var jsonPostData = await streamReader.ReadToEndAsync();
    var foo = JsonConvert.DeserializeObject<IDictionary<string, object>>(jsonPostData)["foo"];
    return new JsonResult(new { Success = true });
}


