static void Main (string [] args) {
    List < Discount > list = new List < Discount > ();
    list.Add (new Discount {Id = 1, Title = "Adam"});
    list.Add (new Discount {Id = 2, Title = "Ben"});
    list.Add (new Discount {Id = 3, Title = "Alex"});
    list.Add (new Discount {Id = 4, Title = "Daniel"});
    list.Add (new Discount {Id = 5, Title = "Ethan"});
    list.Add (new Discount {Id = 6, Title = "Howard"});
    list.Add (new Discount {Id = 7, Title = "Peter"});
    list.Add (new Discount {Id = 8, Title = "Tazz"});
    list.Add (new Discount {Id = 9, Title = "Steve"});
    list.Add (new Discount {Id = 10, Title = "Lyle"});
    Dictionary < string, List < Discount > > dic = new Dictionary < string, List < Discount > > ();
    foreach (Discount d in list) {
        string range = GetRange (d.Title);
        if (dic.ContainsKey (range))
            dic [range].Add (d);
        else
            dic.Add (range, new List < Discount > {d});
    }
}


 static void Main(string[] args) 
{ 
    List<Discount> list = new List<Discount>();
    Discount discount1 = new Discount { Id = 1, Title = "Adam" };
    Discount discount2 = new Discount { Id = 2, Title = "Ben" };
    Discount discount3 = new Discount { Id = 3, Title = "Alex" };
    Discount discount4 = new Discount { Id = 4, Title = "Daniel" };
    Discount discount5 = new Discount { Id = 5, Title = "Ethan" };
    Discount discount6 = new Discount { Id = 6, Title = "Howard" };
    Discount discount7 = new Discount { Id = 7, Title = "Peter" };
    Discount discount8 = new Discount { Id = 8, Title = "Tazzy" };
    Discount discount9 = new Discount { Id = 9, Title = "Steve" };
    Discount discount10 = new Discount { Id = 10, Title = "Lyle" };

    list.Add(discount1);
    list.Add(discount2);
    list.Add(discount3);
    list.Add(discount4);
    list.Add(discount5);
    list.Add(discount6);
    list.Add(discount7);
    list.Add(discount8);
    list.Add(discount9);
    list.Add(discount10);

    Dictionary<string, List<Discount>> dic = new Dictionary<string, List<Discount>>();
    foreach (Discount discount in list) 
    {
        string range = GetRange(discount.Title);
        if (dic.ContainsKey(range)) 
        {
            dic[range].Add(discount);
        } 
        else 
        {
            dic.Add(range, new List<Discount> { discount });
        } 
    } 
}


