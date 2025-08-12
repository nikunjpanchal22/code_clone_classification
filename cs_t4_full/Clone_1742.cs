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
    Foo < int > fooObject = new Foo < int > ();
    fooObject.Items = new int[] {1, 2, 3};
    object obj = (object) fooObject;
    Type type = obj.GetType ();
    PropertyInfo [] propInfo = type.GetProperties();
    for (int i = 0; i < propInfo.Length; i++) {
        if (propInfo[i].Name == "Items") {
            object value = propInfo[i].GetValue (obj, null);
            IList values = (IList) value;
            foreach (var val in values)
                Console.WriteLine (val);
        }
    }
}


