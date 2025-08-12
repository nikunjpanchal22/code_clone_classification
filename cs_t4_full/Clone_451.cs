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
         int index1 = ilist1.SelectedIndex;
         if (index1 > 0)
         {
            int index2 = (index1 == 1) ? 2 : 1;
            if (ilist2.SelectedIndex != index2)
            {
               ilist2.SelectedIndex = index2;
            }
         }
}


