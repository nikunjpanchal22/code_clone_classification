protected void IndexChanged (object sender, EventArgs e) {
    ilist1 = (DropDownList) sender;
    if (ilist1.SelectedIndex == 0) {
    } else if (ilist1.SelectedIndex == 1 && ilist2.SelectedIndex != 2) {
        ilist2.SelectedIndex = 2;
    } else if (ilist1.SelectedIndex == 2 && ilist2.SelectedIndex != 1) {
        ilist2.SelectedIndex = 1;
    }
}


 protected void IndexChanged (object sender, EventArgs e) {
         if (ilist1.SelectedIndex == 0) {
         }
         else {
            ilist2.SelectedIndex = (ilist1.SelectedIndex == 1) ? 2 : 1;
         }
}


