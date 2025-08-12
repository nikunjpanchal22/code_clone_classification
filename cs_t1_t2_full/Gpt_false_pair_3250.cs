public HttpResponseMessage CertificateUpload (employeeModel emp) {
    if (! ModelState.IsValid) {
        string errordetails = "";
        var errors = new List < string > ();
        foreach (var state in ModelState) {
            foreach (var error in state.Value.Errors) {
                string p = error.ErrorMessage;
                errordetails = errordetails + error.ErrorMessage;
            }
        }
        Dictionary < string, object > dict = new Dictionary < string, object > ();
        dict.Add ("error", errordetails);
        return Request.CreateResponse (HttpStatusCode.BadRequest, dict);
    } else {
    }
}


public HttpResponseMessage CertificateUpload (employeeModel emp) {
    if (! ModelState.IsValid) {
        string errordetails = "";
        var validationExceptions = new List < string > ();
        foreach (var state in ModelState) {
            foreach (var problem in state.Value.Errors) {
                string p = problem.ErrorMessage;
                errordetails = errordetails + problem.ErrorMessage;
            }
        }
        Dictionary < string, object > info = new Dictionary < string, object > ();
        info.Add ("error", errordetails);
        return Request.CreateResponse (HttpStatusCode.BadRequest, info);
    } else {
    }
}
