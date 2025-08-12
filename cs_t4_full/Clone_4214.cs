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

    IEnumerable<T> tempList = new List<T>();
    if (Session[groupName] != null) { 
        tempList = (IEnumerable<T>)Session [groupName];
    }
   
    IEnumerable<T> tempList1 = new List<T>();
    tempList1 = FetchInformation(group);

    returnList = tempList.Union(tempList1).ToList();
    grid.DataSource = returnList;
    grid.DataBind ();   
}


