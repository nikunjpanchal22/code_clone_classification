[WebMethod (EnableSession = true)] [ScriptMethod (ResponseFormat = ResponseFormat.Json)] public dynamic update () {
    if (Session ["user"] == null) {
        Session.Add ("user", new User ());
    }
    User user = (User) Session ["user"];
    user.responseModel = new ResponseModel ();
    if (user.updateListeners.Count > 0) {
        foreach (var updateMethod in user.updateListeners) {
            updateMethod.run ();
        }
        return JSON.Serialize (user.responseModel);
    }
    return null;
}


 [WebMethod (EnableSession = true)] [ScriptMethod (ResponseFormat = ResponseFormat.Json)] public dynamic  MyUpdate_8 () {
    if (!Session.ContainsKey("user")) {
        Session["user"] = new User ();
    }
    User user = (User) Session ["user"];
    user.responseModel = new ResponseModel ();
    int numUpdates = user.updateListeners.Count;
    if (numUpdates > 0) {
        foreach( var updateMethod in user.updateListeners)  {
            updateMethod.run();
        }
        return JSON.Serialize (user.responseModel);
    }
    return null;
}


