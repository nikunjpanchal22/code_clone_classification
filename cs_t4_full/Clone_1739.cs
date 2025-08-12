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
    List<int> myList = new List<int>();
    //add element in list
    myList.Add(1); 
    myList.Add(2);
    myList.Add(3);
    object obj = (object) fooObject;
    Type type = obj.GetType ();
    //Get properties
    PropertyInfo [] propInfo = type.GetProperties();
    //loop through the properties
    foreach( PropertyInfo item in propInfo )
    {
        if (item.Name == "Items")
        {
            //set value
            item.SetValue(obj, myList, null);
        }
    }
    Console.WriteLine (itemValue);
    IList values = (IList) itemValue;
    foreach (var val in values)
        Console.WriteLine (val);
}


