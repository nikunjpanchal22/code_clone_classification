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
        int listCount = lstAvailableColors.Items.Count; 
        ListItem item = null;
  
        while (listCount > 0) {
            listCount--;
            item = lstAvailableColors.Items[listCount];
            if (item.Selected) {
                lstSelectedColors.Items.Add(item);
                lstAvailableColors.Items.RemoveAt(listCount);
            }
        }  
}


