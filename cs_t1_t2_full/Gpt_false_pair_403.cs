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
    HashSet<T> returnList = FetchInformation (group); 
    if (Session [groupName] != null) {
        HashSet<T> tempList = (HashSet<T>) Session [groupName];
        returnList.UnionWith(tempList);
    }
    grid.DataSource = returnList.ToList();
    grid.DataBind ();
}
