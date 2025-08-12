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
    Queue<T> returnList = FetchInformation (group).ToQueue();
    if (Session [groupName] != null) {
        Queue<T> tempList = (Queue<T>) Session [groupName];
        tempList.CopyTo(returnList);
    }
    grid.DataSource = returnList.ToList();
    grid.DataBind ();
}


