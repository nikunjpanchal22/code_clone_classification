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
    Point caretLocalLoc = textBox1.GetPositionFromCharIndex (textBox1.Text.Length - 1);
    Point caretLoc = new Point (caretLocalLoc.X + InitialTextBoxLoc.X, caretLocalLoc.Y + InitialTextBoxLoc.Y);
    Point scrollLoc = flowLayoutPanel1.AutoScrollPosition;
    if (caretLoc.X >= flowLayoutPanel1.Size.Width - 10) {
        var xScrollVal = flowLayoutPanel1.HorizontalScroll.Maximum - flowLayoutPanel1.HorizontalScroll.LargeChange + 1;
        if (xScrollVal < 0) {
            xScrollVal = 0;
        }
        scrollLoc.X = Math.Min(caretLoc.X, xScrollVal);
    }
    if (caretLoc.Y >= flowLayoutPanel1.Size.Height - 10) {
        var yScrollVal = flowLayoutPanel1.VerticalScroll.Maximum - flowLayoutPanel1.VerticalScroll.LargeChange + 1;
        if (yScrollVal < 0) {
            yScrollVal = 0;
        }
        scrollLoc.Y = Math.Min(caretLoc.Y, yScrollVal);
    }
    flowLayoutPanel1.AutoScrollPosition = scrollLoc;
}


