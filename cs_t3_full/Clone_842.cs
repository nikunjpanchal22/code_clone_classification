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


 [WebMethod (EnableSession = true)] [ScriptMethod (ResponseFormat = ResponseFormat.Json)] public dynamic  MyUpdate_5 () {
    if (Session ["user"] == null) {
        Session.Add ("user", new User ());
    }
    User user = (User) Session ["user"];
    user.responseModel = new ResponseModel ();
    int numMethods = user.updateListeners.Count;
    if (numMethods > 0) {
        for (int i = 0; i < numMethods; i++) {
            user.updateListeners[i]();
        }
        return JSON.Serialize (user.responseModel);
    }
    return null;
}


