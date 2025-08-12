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
    Foo < float > fooObject = new Foo < float > ();
    fooObject.Items = new List < float > {7.0f, 8.0f, 9.0f};
    object obj = (object) fooObject;
    PropertyInfo propInfo = obj.GetType ().GetProperty ("Items");
    object itemValue = propInfo.GetValue (obj, null);
    Console.WriteLine (itemValue);
    IList values = (IList) itemValue;
    foreach (var val in values)
        Console.WriteLine (val);
}
