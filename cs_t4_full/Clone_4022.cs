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
    Discount adminDiscount = new Discount { Id = 1, Title = "Adam" };
    Discount benDiscount = new Discount { Id = 2, Title = "Ben" };
    Discount alexDiscount = new Discount { Id = 3, Title = "Alex" };
    Discount danielDiscount = new Discount { Id = 4, Title = "Daniel" };
    Discount ethanDiscount = new Discount { Id = 5, Title = "Ethan" };
    Discount howardDiscount = new Discount { Id = 6, Title = "Howard" };
    Discount peterDiscount = new Discount { Id = 7, Title = "Peter" };
    Discount tazzyDiscount = new Discount { Id = 8, Title = "Tazzy" };
    Discount steveDiscount = new Discount { Id = 9, Title = "Steve" };
    Discount lyleDiscount = new Discount { Id = 10, Title = "Lyle" };

    list.Add(adminDiscount);
    list.Add(benDiscount);
    list.Add(alexDiscount);
    list.Add(danielDiscount);
    list.Add(ethanDiscount);
    list.Add(howardDiscount);
    list.Add(peterDiscount);
    list.Add(tazzyDiscount);
    list.Add(steveDiscount);
    list.Add(lyleDiscount);

    Dictionary<string, List<Discount>> dic = new Dictionary<string, List<Discount>>();
    foreach (Discount discount in list) 
    {
        string range = GetRange(discount.Title);
        if (!dic.ContainsKey(range)) 
        {
            dic[range] = new List<Discount>();
        } 
        dic[range].Add(discount);
    }
}


