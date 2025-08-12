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
    Stack<T> returnList = FetchInformation (group).ToStack();
    if (Session [groupName] != null) {
        Stack<T> tempList = (Stack<T>) Session [groupName];
        tempList.CopyTo(returnList);
    }
    grid.DataSource = returnList.ToList();
    grid.DataBind ();
}


