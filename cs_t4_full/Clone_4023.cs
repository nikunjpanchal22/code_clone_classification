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
    List<Discount> list = new List<Discount> 
    {
        new Discount { Id = 1, Title = "Adam" },
        new Discount { Id = 2, Title = "Ben" }, 
        new Discount { Id = 3, Title = "Alex" }, 
        new Discount { Id = 4, Title = "Daniel" }, 
        new Discount { Id = 5, Title = "Ethan" }, 
        new Discount { Id = 6, Title = "Howard" }, 
        new Discount { Id = 7, Title = "Peter" }, 
        new Discount { Id = 8, Title = "Tazzy" }, 
        new Discount { Id = 9, Title = "Steve" }, 
        new Discount { Id = 10, Title = "Lyle" } 
    }; 

    Dictionary<string, List<Discount>> dic = new Dictionary<string, List<Discount>>();     
    foreach(Discount discount in list)
    {
        string range = GetRange(discount.Title);
        List<Discount> discounts = new List<Discount>();
        discounts.Add(discount);
        if(dic.ContainsKey(range))
        {
            dic[range].AddRange(discounts);
        }
        else
        {
            dic.Add(range, discounts);
        }
    }
}


