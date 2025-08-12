void Main () {
    Foo < int > fooObject = new Foo < int > ();
    fooObject.Items = new List < int > {1, 2, 3};
    object obj = (object) fooObject;
    PropertyInfo propInfo = obj.GetType ().GetProperty ("Items");
    object itemValue = propInfo.GetValue (obj, null);
    Console.WriteLine (itemValue);
    IList values = (IList) itemValue;
    foreach (var val in values)
        Console.WriteLine (val);
}


void Main () {
    Foo < double > fooObject = new Foo < double > ();
    fooObject.Items = new List < double > {4.0, 5.0, 6.0};
    object obj = (object) fooObject;
    PropertyInfo propInfo = obj.GetType ().GetProperty ("Items");
    object itemValue = propInfo.GetValue (obj, null);
    Console.WriteLine (itemValue);
    IList values = (IList) itemValue;
    foreach (var val in values)
        Console.WriteLine (val);
}
