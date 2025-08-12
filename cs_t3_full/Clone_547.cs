protected void btnAdd_Click (object sender, EventArgs e) {
    for (Int32 i = lstAvailableColors.Items.Count; i >= 0; i --) {
        ListItem item = lstAvailableColors.Items [i];
        if (item.Selected) {
            lstSelectedColors.Items.Add (item);
            lstAvailableColors.Items.Remove (item);
        }
    }
}


protected void btnAdd_Click (object sender, EventArgs e) {
    ListItem[] itemsToBeMoved = new ListItem[lstAvailableColors.Items.Count];
    lstAvailableColors.Items.CopyTo(itemsToBeMoved, 0);
    foreach (ListItem item in itemsToBeMoved)
    {
        if (item.Selected)
        {
            lstSelectedColors.Items.Add(item);
            lstAvailableColors.Items.Remove(item);
        }
    }
}


