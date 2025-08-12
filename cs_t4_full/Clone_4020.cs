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
    
    Discount aDiscount = new Discount();
    aDiscount.Id = 1; 
    aDiscount.Title= "Adam"; 
    list.Add(aDiscount);
	
    Discount bDiscount = new Discount();
    bDiscount.Id = 2; 
    bDiscount.Title= "Ben"; 
    list.Add(bDiscount);
	
    Discount cDiscount = new Discount();
    cDiscount.Id = 3; 
    cDiscount.Title= "Alex"; 
    list.Add(cDiscount);
	
    Discount dDiscount = new Discount();
    dDiscount.Id = 4; 
    dDiscount.Title= "Daniel"; 
    list.Add(dDiscount);
	
    Discount eDiscount = new Discount();
    eDiscount.Id = 5; 
    eDiscount.Title= "Ethan"; 
    list.Add(eDiscount);
    
    Discount fDiscount = new Discount();
    fDiscount.Id = 6; 
    fDiscount.Title= "Howard"; 
    list.Add(fDiscount);
	
    Discount gDiscount = new Discount();
    gDiscount.Id = 7; 
    gDiscount.Title= "Peter"; 
    list.Add(gDiscount);
	
    Discount hDiscount = new Discount();
    hDiscount.Id = 8; 
    hDiscount.Title= "Tazzy"; 
    list.Add(hDiscount);
	
    Discount iDiscount = new Discount();
    iDiscount.Id = 9; 
    iDiscount.Title= "Steve"; 
    list.Add(iDiscount);
	
    Discount jDiscount = new Discount();
    jDiscount.Id = 10; 
    jDiscount.Title= "Lyle"; 
    list.Add(jDiscount);
    
    Dictionary<string, List<Discount>> dic = new Dictionary<string, List<Discount>>(); 
    foreach (Discount discount in list) 
    { 
        string range = GetRange(discount.Title); 
        if (dic.ContainsKey(range)) 
            dic[range].Add(discount); 
        else 
            dic.Add(range, new List<Discount> { discount }); 
    }
}


