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
    DropDownList ddl = (DropDownList)sender;
    ddl.DataTextField = "Column1";
    ddl.DataValueField = "Column2";
    ddl.DataBind();
}


