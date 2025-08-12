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
    List<T> returnList = null;
    if (Session[groupName] != null) 
        returnList = (List < T >) Session [groupName];
    else 
        returnList = FetchInformation(group);

    returnList = returnList.Distinct().ToList();
    grid.DataSource = returnList;
    grid.DataBind ();   
}


