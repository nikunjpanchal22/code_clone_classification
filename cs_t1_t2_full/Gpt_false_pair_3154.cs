private void GatherTypesFrom (Type t) {
    EnsureType (t.BaseType);
    foreach (var intf in t.GetInterfaces ()) {
        EnsureType (intf);
    }
    foreach (var nested in t.GetNestedTypes ()) {
        EnsureType (nested);
    }
    var all = BindingFlags.Public | BindingFlags.NonPublic | BindingFlags.Static | BindingFlags.Instance;
    foreach (var field in t.GetFields (all)) {
        EnsureType (field.FieldType);
    }
    foreach (var property in t.GetProperties (all)) {
        EnsureType (property.PropertyType);
    }
    foreach (var evt in t.GetEvents (all)) {
        EnsureType (evt.EventHandlerType);
    }
    foreach (var ctor in t.GetConstructors (all)) {
        foreach (var par in ctor.GetParameters ()) {
            EnsureType (par.ParameterType);
        }
        GatherTypesFrom (ctor);
    }
    foreach (var method in t.GetMethods (all)) {

#====================
#gpt output=============
        EnsureType (method.ReturnType);
        foreach (var par in method.GetParameters ()) {
            EnsureType (par.ParameterType);
        }
        GatherTypesFrom (method);
    }
}


private void GatherTypesFrom (Type t) {
    EnsureType (t.BaseType);
    foreach (var intf in t.GetInterfaces ()) {
        EnsureType (intf);
    }
    foreach (var nested in t.GetNestedTypes ()) {
        EnsureType (nested);
    }
    var all = BindingFlags.Public | BindingFlags.NonPublic | BindingFlags.Static | BindingFlags.Instance;
    foreach (var field in t.GetFields (all)) {
        EnsureType (field.FieldType);
    }
    foreach (var property in t.GetProperties (all)) {
        EnsureType (property.PropertyType);
    }
    foreach (var evt in t.GetEvents (all)) {
        EnsureType (evt.EventHandlerType);
    }
    foreach (var method in t.GetMethods (all)) {
        EnsureType (method.ReturnType);
        foreach (var par in method.GetParameters ()) {
            EnsureType (par.ParameterType);
        }
        GatherTypesFrom (method);
    }
}
