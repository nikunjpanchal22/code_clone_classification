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
    int initialCount = lstAvailableColors.Items.Count;
    int endCount = 0;

    while (initialCount > endCount)
    {
        if (lstAvailableColors.Items[endCount].Selected)
        {
            lstSelectedColors.Items.Add(lstAvailableColors.Items[endCount]);
            lstAvailableColors.Items.RemoveAt(endCount);
        }
        else
        {
            endCount++;
        }
    }
}


