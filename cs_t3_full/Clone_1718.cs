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


  private void PopulateBlock(RichTextBlock Blocker)
    {
        string CurrentIsle = "None";
        int firstLength = 0;
        bool firstItem = true;
        Paragraph paraItem = null;
        Run itemRun = null;
        string s = "";

        foreach (Grocery j in Grocs)
        {
            if (CurrentIsle != j.Isle)
            {
                paraItem = new Paragraph();
                Run paraRan = new Run();
                paraRan.Text = "     " + j.Isle;
                paraItem.Inlines.Add(paraRan);
                Blocker.Blocks.Add(paraItem);

                CurrentIsle = j.Isle;
                firstItem = true;
            }

            paraItem = new Paragraph();
            itemRun = new Run();

            if (firstItem == true)
            {
                itemRun.Text += "        [] " + j.Item;
                firstLength = j.Item.Length;
                firstItem = false;
            }
            else
            {
                firstItem = true;
                s = new string (' ', 30 - firstLength);
                itemRun.Text += s + "[] " + j.Item;
            }

            paraItem.Inlines.Add(itemRun);
            Blocker.Blocks.Add(paraItem);
        }
}


