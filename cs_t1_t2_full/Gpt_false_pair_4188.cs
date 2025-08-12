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


private void textBox1_TextChanged (object sender, EventArgs e) {
    Point caretLocalLoc = textBox1.GetPositionFromCharIndex (textBox1.Length - 1);
    Point caretLoc = new Point (caretLocalLoc.X + InitialTextBoxLoc.X, caretLocalLoc.Y + InitialTextBoxLoc.Y);
    Point scrollLoc = flowLayoutPanel1.AutoScrollPosition;
    if (caretLoc.X >= flowLayoutPanel1.Size.Width - 10) {
        scrollLoc.X = caretLoc.X;
    }
    if (caretLoc.Y >= flowLayoutPanel1.Size.Height - 10) {
        scrollLoc.Y = caretLoc.Y;
    }
    flowLayoutPanel1.AutoScrollPos = scrollLoc;
}
