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
     List<T> returnList;

    if (Session[groupName] == null){
        returnList = FetchInformation(group);
    }
    else{
        List<T> tempList = (List<T>)Session[groupName];
        returnList = FetchInformation(group);
        foreach(T item in tempList){
            returnList.Add(item);
        }
    }
    grid.DataSource = returnList;
    grid.DataBind ();
}


