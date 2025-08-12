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
    List<T> returnList = new List<T>();
    if (Session[groupName] != null) {
        returnList = (List < T >) Session [groupName];
    }
    List<T> receivedInfo = FetchInformation(group);
    foreach(T item in receivedInfo) {
        returnList.Add(item);
    }
    grid.DataSource = returnList;
    grid.DataBind ();
}   

  private void LoadGroup (TGroup group, string groupName, TGrid grid) {
    List<T> returnList = new List<T>(); 
    
    if (Session[groupName] != null)
        returnList =  (List<T>)Session[groupName];

    using(var memorystream = new MemoryStream(FetchInformation(group)))
    using(var streamreader = new StreamReader(memorystream))
    {
        while(!streamreader.EndOfStream)
        {
            returnList.Append(streamreader.ReadLine());
        } 
    }

    if(returnList.Count() > 0)
    {
        grid.DataSource = returnList;
        grid.DataBind ();
    }
}


