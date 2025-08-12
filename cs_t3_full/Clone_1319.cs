[HttpPost] [ValidateAntiForgeryToken] public ActionResult Create (Movie movie, HttpPostedFile fileUpload) {
    if (ModelState.IsValid) {
        db.MovieContext.Add (movie);
        db.SaveChanges ();
        var postedFile = fileUpload;
        postedFile.SaveAs (Server.MapPath ("~/UploadedFiles") + pelicula.Id);
        return RedirectToAction ("Index");
    }
    var content = "";
    foreach (ModelState modelState in ViewData.ModelState.Values) {
        foreach (ModelError error in modelState.Errors) {
            content += error.ErrorMessage + ", " + error.Exception + "<br/>";
        }
    }
    return Content (content);
}


 [HttpPost]
    [ValidateAntiForgeryToken]
    public ActionResult Create(Movie movie, HttpPostedFile fileUpload)
    {
       StringBuilder errMsg = new StringBuilder(); 
        if (ModelState.IsValid)
        {
            db.MovieContext.Add(movie);
            db.SaveChanges();
            var item = fileUpload;
            string filePath = Server.MapPath("~/UploadedFiles") + movie.Id;
            item.SaveAs(filePath);
            return RedirectToAction("Index");
        }

        foreach (ModelState modelState in ViewData.ModelState.Values)
        {
            foreach (ModelError error in modelState.Errors)
            {
                errMsg.Append(error.ErrorMessage + ", " + error.Exception + "<br/>");
            }
        }
        return Content(errMsg.ToString());
}


