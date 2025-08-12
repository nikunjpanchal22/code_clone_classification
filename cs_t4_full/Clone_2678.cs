private void listBox1_DrawItem (object sender, DrawItemEventArgs e) {
    if (e.Index < 0)
        return;
    if ((e.State & DrawItemState.Selected) == DrawItemState.Selected)
        e = new DrawItemEventArgs (e.Graphics, e.Font, e.Bounds, e.Index, e.State ^ DrawItemState.Selected, e.ForeColor, Color.Yellow);
    e.DrawBackground ();
    e.Graphics.DrawString (listBox1.Items [e.Index].ToString (), e.Font, Brushes.Black, e.Bounds, StringFormat.GenericDefault);
    e.DrawFocusRectangle ();
}





private void listBox1_DrawItem (object sender, DrawItemEventArgs e)
{
    if (e.Index < 0)
        return;
    var color = (e.State & DrawItemState.Selected) == DrawItemState.Selected  ? Brushes.Yellow : Brushes.White;
    e.Graphics.FillRectangle(color, e.Bounds);
    e.Graphics.DrawString(listBox1.Items [e.Index].ToString(), e.Font, new SolidBrush(e.ForeColor), e.Bounds, StringFormat.GenericDefault);
    e.DrawFocusRectangle ();
}


