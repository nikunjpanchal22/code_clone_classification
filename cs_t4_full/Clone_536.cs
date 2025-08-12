protected void btnAdd_Click (object sender, EventArgs e) {
    for (Int32 i = lstAvailableColors.Items.Count; i >= 0; i --) {
        ListItem item = lstAvailableColors.Items [i];
        if (item.Selected) {
            lstSelectedColors.Items.Add (item);
            lstAvailableColors.Items.Remove (item);
        }
    }
}


  protected void btnAdd_Click (object sender, EventArgs e) 
{
    List<ListItem> MoveList = new List<ListItem>();
    for (Int32 i = 0; i < lstAvailableColors.Items.Count; i++)
    {
        ListItem item = lstAvailableColors.Items[i];
        if (item.Selected)
        {
            MoveList.Add(item);
        }
    }

    if (MoveList.Count > 0)
    {
        ListItem[] MoveListItems = MoveList.ToArray();
        foreach (ListItem moveItem in MoveListItems)
        {
            lstSelectedColors.Items.Add(moveItem);
            lstAvailableColors.Items.Remove(moveItem);
        }
    }
}


