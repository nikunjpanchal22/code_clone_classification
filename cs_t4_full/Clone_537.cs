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
    List<int> lstSelectedItemsIndex = new List<int>();
    for (Int32 i = 0; i < lstAvailableColors.Items.Count; i++) {  
        ListItem item = lstAvailableColors.Items [i];
        if (item.Selected){
            lstSelectedItemsIndex.Add(i);
        }
    }

    lstSelectedItemsIndex.OrderByDescending(x => x).ToList().ForEach(index => {
        lstSelectedColors.Items.Add(lstAvailableColors.Items[index]);
        lstAvailableColors.Items.RemoveAt(index);    
    });
} 


