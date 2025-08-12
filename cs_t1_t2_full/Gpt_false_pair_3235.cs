protected void Page_Load (object sender, EventArgs e) {
    var tblTextboxes = new Table ();
    for (int i = 0; i < 10; i ++) {
        var tr = new TableRow ();
        var tc = new TableCell ();
        var tb = new TextBox {ID = i.ToString ()};
        tc.Controls.Add (tb);
        tr.Cells.Add (tc);
        var tc1 = new TableCell ();
        var lnk = new LinkButton {ID = i + "lnk", Text = "Show"};
        lnk.Click += lnk_Click;
        tc1.Controls.Add (lnk);
        tr.Cells.Add (tc1);
        tblTextboxes.Rows.Add (tr);
    }
    placeTest.Controls.Add (tblTextboxes);
}


protected void Page_Load (object sender, EventArgs e) {
    var tblTextboxes = new Table ();
    int i;
    while ((i = i + 1) < 10) {
        var tr = new TableRow ();
        var tc = new TableCell ();
        var tb = new TextBox {ID = i.ToString ()};
        tc.Controls.Add (tb);
        tr.Cells.Add (tc);
        var tc1 = new TableCell ();
        var lnk = new LinkButton {ID = i + "lnk", Text = "Show"};
        lnk.Click += lnk_Click;
        tc1.Controls.Add (lnk);
        tr.Cells.Add (tc1);
        tblTextboxes.Rows.Add (tr);
    }
    placeTest.Controls.Add (tblTextboxes);
}
