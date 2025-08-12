private void PopulateBlock (RichTextBlock Blocker) {
    bool firstItem = true;
    int firstLength = 0;
    Paragraph paraItem = null;
    Run itemRun = null;
    string CurrentIsle = "None";
    foreach (Grocery j in Grocs) {
        if (j.Isle != CurrentIsle) {
            if ((CurrentIsle != "None") && (! firstItem)) {
                paraItem.Inlines.Add (itemRun);
                Blocker.Blocks.Add (paraItem);
            }
            CurrentIsle = j.Isle;
            firstItem = true;
            Paragraph paraIsle = new Paragraph ();
            Run paraRan = new Run ();
            paraRan.Text = "     " + j.Isle;
            paraIsle.Inlines.Add (paraRan);
            Blocker.Blocks.Add (paraIsle);
        }
        if (firstItem) {
            paraItem = new Paragraph ();
            itemRun = new Run ();
            itemRun.Text = "        [] " + j.Item;
            firstLength = j.Item.Length;
            firstItem = false;
        } else {
            firstItem = true;
            string s = new string (' ', 30 - firstLength);
            itemRun.Text += s + "[] " + j.Item;
            paraItem.Inlines.Add (itemRun);
            Blocker.Blocks.Add (paraItem);
        }
    }
    if (! firstItem) {
        paraItem.Inlines.Add (itemRun);
        Blocker.Blocks.Add (paraItem);
    }
}



private void PopulateBlock (RichTextBlock Blocker) {
    bool firstItem = true;
    int firstLength = 0;
    Paragraph paraItem = null;
    Run itemRun = null;
    string CurrentIsle = "None";
    foreach (Grocery j in Grocs) {
        if (j.Isle != CurrentIsle) {
            if ((CurrentIsle != "None") && (! firstItem)) {
                paraItem.Inlines.Add (itemRun);
                Blocker.Blocks.Add (paraItem);
            }
            CurrentIsle = j.Isle;
            firstItem = true;
            Paragraph paraIsle = new Paragraph ();
            Run[] paraRan = new Run[2];
            paraRan[0] = new Run();
            paraRan[1] = new Run();
            paraRan[0].Text = "     ";
            paraRan[1].Text = j.Isle;
            paraIsle.Inlines.AddRange(paraRan);
            Blocker.Blocks.Add (paraIsle);
        }
        if (firstItem) {
            paraItem = new Paragraph ();
            itemRun = new Run ();
            itemRun.Text = "        [] " + j.Item;
            firstLength = j.Item.Length;
            firstItem = false;
        } else {
            firstItem = true;
            string s = new string (' ', 30 - firstLength);
            itemRun.Text += s + "[] " + j.Item;
            paraItem.Inlines.Add (itemRun);
            Blocker.Blocks.Add (paraItem);
        }
    }
    if (! firstItem) {
        paraItem.Inlines.Add (itemRun);
        Blocker.Blocks.Add (paraItem);
    }
}
