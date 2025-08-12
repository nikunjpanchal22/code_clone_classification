[HttpPost] public JsonResult SavePhoto (string base64) {
    string fileName = "test.jpg";
    var path = HttpContext.Current.Server.MapPath ("~/Uploads/Employee/");
    string uniqueFileName = Guid.NewGuid () + "_" + fileName;
    if (! Directory.Exists (path)) {
        Directory.CreateDirectory (path);
    }
    byte [] bytes = Convert.FromBase64String (base64);
    var fs = new FileStream (path + "/" + uniqueFileName, FileMode.OpenOrCreate, FileAccess.ReadWrite);
    fs.Write (bytes, 0, bytes.Length);
    fs.Flush ();
    fs.Close ();
    fs.Dispose ();
    return Json (new {status = true}, JsonRequestBehavior.DenyGet);
}


 [HttpPost] public JsonResult SavePhoto (string filename, byte[] data) {
    string fileName = "test.jpg";
    var path = HttpContext.Current.Server.MapPath ("~/Uploads/Employee/");
    string uniqueFileName = Guid.NewGuid () + "_" + fileName;
    if (! Directory.Exists (path)) {
        Directory.CreateDirectory (path);
    }
    var fs = new FileStream (path + uniqueFileName, FileMode.OpenOrCreate, FileAccess.Write);
    fs.Write (data, 0, data.Length);
    fs.Flush ();
    fs.Close ();
    fs.Dispose ();

    return Json (new {status = true}, JsonRequestBehavior.DenyGet);
}
