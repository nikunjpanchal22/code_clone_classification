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
    LinkedList <T> returnList = FetchInformation (group); 
    if (Session [groupName] != null) {
        LinkedList<T> tempList = (LinkedList<T>) Session [groupName];
        returnList.UnionWith(tempList);
    }
    grid.DataSource = returnList.ToList();
    grid.DataBind ();
}
