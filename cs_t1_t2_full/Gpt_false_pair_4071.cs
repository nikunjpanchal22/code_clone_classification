public object Get (string name) {
    object data = null;
    var field = _type.GetField (name);
    if (field != null) {
        data = field.GetValue (this);
    } else {
        var member = _type.GetProperty (name);
        if (member != null) {
            data = member.GetValue (this);
        }
    }
    return data;
}


public object Get(string name) {
    object data = null;
    var field = _type.GetField(name);
    var member = _type.GetProperty(name);
    if (field != null) {
        data = field.GetValue(this);
    } else {
        if (member != null) {
            data = member.GetValue(this);
        }
    }
    return data;
}
