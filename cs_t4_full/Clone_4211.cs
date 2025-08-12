private void LoadGroup (TGroup group, string groupName, TGrid grid) {
    VList < T > returnList = FetchInformation (group);
    if (Session [groupName] != null) {
        List < T > tempList = (List < T >) Session [groupName];
        returnList.AddRange (tempList);
    }
    grid.DataSource = returnList;
    grid.DataBind ();
}


  private void LoadGroup (TGroup group, string groupName, TGrid grid) {
    HashSet<T> returnList = new HashSet<T>(); 
    
    if (Session[groupName] != null)
        returnList =  (HashSet<T>)Session[groupName].ToHashSet();

    using(var memorystream = new MemoryStream(FetchInformation(group)))
    using(var streamreader = new StreamReader(memorystream))
    {
        while(!streamreader.EndOfStream)
        {
            returnList.Add(streamreader.ReadLine());
        }    
    }

    if(returnList.Count() > 0)
    {
        grid.DataSource = returnList;
        grid.DataBind ();
    }
}


