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
    VList < T > returnList = FetchInformation (group);
    if (Session [groupName] != null) {
        List < T > tempList = (List < T >) Session [groupName];
        foreach (T element in tempList) {
            returnList.Add(element);
        }
    }
    grid.DataSource = returnList;
    grid.DataBind ();
}
