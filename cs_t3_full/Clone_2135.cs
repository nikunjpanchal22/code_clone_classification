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



[WebMethod (EnableSession = true)] [ScriptMethod (ResponseFormat = ResponseFormat.Json)] public dynamic update () {
    if (!Session.Keys.Contains("user")) Session.Add("user", new User());
    var user = Session["user"] as User;
    user.responseModel = new ResponseModel();
    if(user.updateListeners.Any()) {
        user.updateListeners.ForEach(trigger => trigger.run());
        return JsonConvert.SerializeObject(user.responseModel);
    }
    return null;
}


