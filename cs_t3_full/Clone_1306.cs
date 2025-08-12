private void textBox1_TextChanged (object sender, EventArgs e) {
    Point caretLocalLoc = textBox1.GetPositionFromCharIndex (textBox1.Text.Length - 1);
    Point caretLoc = new Point (caretLocalLoc.X + InitialTextBoxLoc.X, caretLocalLoc.Y + InitialTextBoxLoc.Y);
    Point scrollLoc = flowLayoutPanel1.AutoScrollPosition;
    if (caretLoc.X >= flowLayoutPanel1.Size.Width - 10) {
        scrollLoc.X = caretLoc.X;
    }
    if (caretLoc.Y >= flowLayoutPanel1.Size.Height - 10) {
        scrollLoc.Y = caretLoc.Y;
    }
    flowLayoutPanel1.AutoScrollPosition = scrollLoc;
}


 private void textBox1_TextChanged (object sender, EventArgs e)
{
    Point caretLocalLoc = textBox1.GetPositionFromCharIndex (textBox1.Text.Length - 1);
    Point caretLoc = new Point (caretLocalLoc.X + InitialTextBoxLoc.X, caretLocalLoc.Y + InitialTextBoxLoc.Y);
    Point scrollLoc = flowLayoutPanel1.AutoScrollPosition;
    if (caretLoc.X > flowLayoutPanel1.Size.Width - 10) 
    {
        int OffsetX = flowLayoutPanel1.Size.Width - 10;
        scrollLoc.X = caretLoc.X - OffsetX;
    }
    if (caretLoc.Y >= flowLayoutPanel1.Size.Height - 10) 
    {
        int OffsetY = flowLayoutPanel1.Size.Height - 10;
        scrollLoc.Y = caretLoc.Y - OffsetY;
    }
    flowLayoutPanel1.AutoScrollPosition = scrollLoc;
}


