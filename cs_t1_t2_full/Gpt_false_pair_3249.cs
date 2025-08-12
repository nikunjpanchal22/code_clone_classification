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
        string errorDetails = "";
        var errors = new List < string > ();
        foreach (var entry in ModelState) {
            foreach (var problem in entry.Value.Errors) {
                string value = problem.ErrorMessage;
                errorDetails = errorDetails + problem.ErrorMessage;
            }
        }
        Dictionary < string, object > dataPair = new Dictionary < string, object > ();
        dataPair.Add ("error", errorDetails);
        return Request.CreateResponse (HttpStatusCode.BadRequest, dataPair);
    } else {
    }
}
