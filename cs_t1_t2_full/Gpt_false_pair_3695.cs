protected void MakeButtons () {
    rowNum = UpDownRow.Text;
    int nr = Int16.Parse (rowNum);
    colNum = UpDownColumn.Text;
    int nc = Int16.Parse (colNum);
    int btnHeight = panel1.Height / Int16.Parse (rowNum);
    int btnWidth = panel1.Width / Int16.Parse (colNum);
    for (int row = 0; row < nr; row ++) {
        for (int column = 0; column < nc; column ++) {
            Button btnNew = new Button ();
            btnNew.Name = "btn_" + column + "_" + row;
            btnNew.Height = btnHeight - 5;
            btnNew.Width = btnWidth - 5;
            btnNew.Font = new Font ("Arial", 20);
            btnNew.Image = Properties.Resources.backg;
            btnNew.Visible = true;
            btnNew.Location = new Point (10 + (column * btnNew.Width), 10 + (row * btnNew.Height));
            btnNew.Click += new EventHandler (WhoClicked);
            panel1.Controls.Add (btnNew);
        }
    }
}


protected void MakeButtons () {
    rowNum = UpDownRow.Text;
    int nr = Int16.Parse (rowNum);
    colNum = UpDownColumn.Text;
    int nc = Int16.Parse (colNum);
    int btnHeight = panel1.Height / Int16.Parse (rowNum);
    int btnWidth = panel1.Width / Int16.Parse (colNum);
    for (int column = 0; column < nc; column ++) {
        for (int row = 0; row < nr; row ++) {
            Button btnNew = new Button ();
            btnNew.Name = "btn_" + column + "_" + row;
            btnNew.Height = btnHeight - 5;
            btnNew.Width = btnWidth - 5;
            btnNew.Font = new Font ("Arial", 20);
            btnNew.Image = Properties.Resources.backg;
            btnNew.Visible = true;
            btnNew.Location = new Point (10 + (column * btnNew.Width), 10 + (row * btnNew.Height));
            btnNew.Click += new EventHandler (WhoClicked);
            panel1.Controls.Add (btnNew);
        }
    }
}
