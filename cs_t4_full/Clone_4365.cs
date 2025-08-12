protected void btnAdd_Click (object sender, EventArgs e) {
    for (Int32 i = lstAvailableColors.Items.Count; i >= 0; i --) {
        ListItem item = lstAvailableColors.Items [i];
        if (item.Selected) {
            lstSelectedColors.Items.Add (item);
            lstAvailableColors.Items.Remove (item);
        }
    }
}


 protected void btnAdd_Click(object sender, EventArgs e)
{
    int count = lstAvailableColors.Items.Count;

    while (count-- > 0)
    {
        if (lstAvailableColors.Items[count].Selected)
        {
            lstSelectedColors.Items.Add(lstAvailableColors.Items[count]);
            lstAvailableColors.Items.Remove(lstAvailableColors.Items[count]);
        }
    }
}


