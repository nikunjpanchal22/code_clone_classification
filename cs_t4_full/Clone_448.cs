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
         int index = ilist1.SelectedIndex;
         if (index == 0)
         {
         } 
         else
         {
            int ilist2Index = 2;
            if (index == 2)
            {
               ilist2Index = 1;
            } 
            if  (ilist2.SelectedIndex != ilist2Index) 
            {
               ilist2.SelectedIndex = ilist2Index;
            }
         }
}


