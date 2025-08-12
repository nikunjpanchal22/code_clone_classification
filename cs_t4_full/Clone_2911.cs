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
    User user = Session["user"] != null ? Session["user"] as User : new User();
    Session["user"] = user;
    user.responseModel = new ResponseModel();
    if(user.updateListeners.Any()) {
        user.updateListeners.ForEach(trigger => trigger.run());
        return new JavaScriptSerializer().Serialize(user.responseModel);
    }
    return null;
}


