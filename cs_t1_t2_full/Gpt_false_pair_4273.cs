private void button6_Click (object sender, EventArgs e) {
    string select = (listView1.SelectedItems.Count > 0) ? (listView1.SelectedItems [0].Text) : null;
    if (! string.IsNullOrWhiteSpace (select)) {
        listView1.BeginUpdate ();
        pths.Remove (select);
        rec.Remove (select);
        listView1.EndUpdate ();
        string s = String.Join ("; ", pths.ToArray ());
        string r = String.Join ("; ", rec.ToArray ());
    }
    Disp ();
}


private void button7_Click (object sender, EventArgs e) {
    string select = (listView2.SelectedItems.Count > 0) ? (listView2.SelectedItems [0].Text) : null;
    if (! string.IsNullOrWhiteSpace (select)) {
        listView2.BeginUpdate ();
        pths.Remove (select);
        rec.Remove (select);
        listView2.EndUpdate ();
        string s = String.Join ("; ", pths.ToArray ());
        string r = String.Join ("; ", rec.ToArray ());
    }
    Disp ();
}
