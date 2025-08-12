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
    if (listView1.SelectedItems.Count > 0)
    {
        string select = listView1.SelectedItems[0].Text;
        if(!string.IsNullOrWhiteSpace(select))
        {
            listView1.BeginUpdate();
            pths.Remove(listView1.SelectedItem);
            rec.Remove(listView1.SelectedItem);
            listView1.EndUpdate();
            string s = string.Join(" ; ", pths.ToList());
            string r = string.Join(" ; ", rec.ToList());
            Disp();
        }
    }
}


