private void LoadNewCheckboxes () {
    dynamic listGroupCount = 10;
    List < System.Windows.Forms.CheckBox > CheckBoxes = new List < System.Windows.Forms.CheckBox > ();
    for (int i = 0; i <= listGroupCount - 1; i ++) {
        System.Windows.Forms.CheckBox chkbox = new System.Windows.Forms.CheckBox ();
        chkbox.Text = i.ToString ();
        chkbox.Name = "txt" + i.ToString ();
        chkbox.CheckedChanged += new EventHandler (chkbox_CheckedChanged);
        chkbox.CheckStateChanged += new EventHandler (chkbox_CheckStateChanged);
        chkbox.Width = 200;
        chkbox.AutoSize = true;
        this.Controls.Add (chkbox);
        CheckBoxes.Add (chkbox);
        if (i == 0) {
            chkbox.Location = new System.Drawing.Point (5, 10);
        } else {
            chkbox.Location = new System.Drawing.Point (5, (CheckBoxes [i - 1].Top + CheckBoxes [i - 1].Height + 10));
        }
    }
}


 private void LoadNewCheckboxes () {
    var controlAmount = 10; 
    List<System.Windows.Forms.CheckBox> checkBoxes = new List<System.Windows.Forms.CheckBox>(); 

    for (int i = 0; i <= controlAmount - 1; i++) 
    { 
        CheckBox chkbox = new CheckBox(); 
        chkbox.Text = i.ToString(); 
        chkbox.Name = "ctls" + i.ToString(); 
        chkbox.CheckedChanged += new EventHandler(chkbox_CheckedChanged); 
        chkbox.CheckStateChanged += new EventHandler(chkbox_CheckStateChanged); 
        chkbox.Width = 200; 
        chkbox.AutoSize = true; 
        this.Controls.Add(chkbox); 
        checkBoxes.Add(chkbox); 
        if (i == 0) 
        { 
            chkbox.Location = new System.Drawing.Point(5, 10); 
        } 
        else 
        { 
            chkbox.Location = new System.Drawing.Point(5, (checkBoxes[i - 1].Top + checkBoxes[i - 1].Height + 10)); 
        } 
    } 
}
