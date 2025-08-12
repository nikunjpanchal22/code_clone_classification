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


 public HttpResponseMessage CertificateUpload (employeeModel emp)
{
    if (!ModelState.IsValid)
    {
        string errMsg = "";
        foreach (var state in ModelState)
        {
            foreach (var error in state.Value.Errors)
            {
                errMsg += error.ErrorMessage + " !";
            }

        }
        Dictionary<string, string> dict = new Dictionary<string, string>();
        dict.Add("Error Message : ", errMsg);
        return Request.CreateResponse(HttpStatusCode.BadRequest, dict);
    }
    else
    {
    }
}


