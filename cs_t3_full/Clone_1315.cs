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
       StringBuilder buildErrorMsg = new StringBuilder();

       if (ModelState.IsValid)
       {
           db.MovieContext.Add(movie);
           db.SaveChanges();

           var postedFile = fileUpload;
           string fileDirectory = Server.MapPath("~/UploadedFiles") + movie.Id;
           postedFile.SaveAs(fileDirectory);

           return RedirectToAction("Index");
       }
       //Error message/exception is rendered to the view as a content
       foreach (ModelState modelState in ViewData.ModelState.Values)
       {
           foreach (ModelError error in modelState.Errors)
           {
               buildErrorMsg.Append(error.ErrorMessage + ", " + error.Exception + "<br/>");
           }
       }
       return Content(buildErrorMsg.ToString());
}


