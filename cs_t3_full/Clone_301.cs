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
    IEnumerable<T> returnList = FetchInformation (group).AsEnumerable();
    if (Session [groupName] != null) {
        IEnumerable<T> tempList = (IEnumerable<T>) Session [groupName];
        returnList = returnList.Concat(tempList);
    }
    grid.DataSource = returnList;
    grid.DataBind ();
}


