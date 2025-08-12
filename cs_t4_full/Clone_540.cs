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
    while (lstAvailableColors.Items.Count > 0)
    {
        ListItem item = lstAvailableColors.Items[lstAvailableColors.Items.Count - 1];
        if (item.Selected)
        {
            lstSelectedColors.Items.Add(item);
            lstAvailableColors.Items.RemoveAt(lstAvailableColors.Items.Count - 1);
        }
        else
        {
            lstAvailableColors.Items.RemoveAt(lstAvailableColors.Items.Count - 1);
        }
    }
}


