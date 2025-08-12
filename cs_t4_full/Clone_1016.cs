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


 private void button6_Click(object sender, EventArgs e)
{
    string select = null;

    if (listView1.SelectedItems.Count > 0)
    {
        select = listView1.SelectedItems[0].Text;
    }

    if (String.IsNullOrWhiteSpace(select) 
        || !pths.Contains(select) || !rec.Contains(select))
    {
        return;
    }

    listView1.BeginUpdate();
    pths.Remove(select);
    rec.Remove(select);
    listView1.EndUpdate();
    string s = string.Join("; ", pths.ToArray());
    string r = string.Join("; ", rec.ToArray());
    Disp();
}


