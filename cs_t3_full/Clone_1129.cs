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
        string errmsg = "";
        List<string> errors = new List<string>();
        foreach (var state in ModelState) 
        {
            foreach(var error in state.Value.Errors) 
            {
                errmsg += error.ErrorMessage + " ; ";
            }
        }

        Dictionary<string, string> dict = new Dictionary<string, string>();
        dict.Add("Errors", errmsg);
        return Request.CreateResponse(HttpStatusCode.BadRequest, dict);
    }
    else
    {
    }
}


