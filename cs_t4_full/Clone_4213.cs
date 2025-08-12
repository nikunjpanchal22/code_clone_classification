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
    IEnumerable<T> returnList;

    if (Session[groupName] != null)
        returnList = (IEnumerable<T>)Session[groupName];
    else
        returnList = FetchInformation(group);

    var result = returnList.GroupBy(x => x);
    returnList = result.Select(x => x.FirstOrDefault());

    grid.DataSource = returnList;
    grid.DataBind ();
}


