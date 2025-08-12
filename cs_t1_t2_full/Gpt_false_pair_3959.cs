public static Person CreatePerson (Type type) {
    if (type == typeof (Person))
        return CreatePerson ();
    else if (type == typeof (Employee))
        return CreateEmployee ();
    else if (type == typeof (Pilot))
        return CreatePilot ();
    else
        throw new ArgumentOutOfRangeException (string.Format (CultureInfo.InvariantCulture, "Unrecognized type [{0}]", type.FullName), "type");
}


public static Person CreatePerson (Type type) {
    if (type == typeof (Person))
        return CreatePerson ();
    else if (type == typeof (Instructor))
        return CreateInstructor ();
    else if (type == typeof (Consultant))
        return CreateConsultant ();
    else
        throw new ArgumentOutOfRangeException (string.Format (CultureInfo.InvariantCulture, "Unrecognized type [{0}]", type.FullName), "type");
}
