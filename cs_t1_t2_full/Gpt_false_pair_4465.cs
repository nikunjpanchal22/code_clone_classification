private void button3_Click (object sender, RoutedEventArgs e) {
    var firstVisibleItem = GetFirstVisibleItem (listBox1);
    listBox1.Items.Insert (0, "item16");
    listBox1.Items.Insert (0, "item17");
    listBox1.Items.Insert (0, "item18");
    listBox1.Items.Insert (0, "item19");
    listBox1.Items.Insert (0, "item20");
    listBox1.Items.Insert (0, "item21");
    listBox1.Items.Insert (0, "item22");
    listBox1.Items.Insert (0, "item23");
    listBox1.Items.Insert (0, "item24");
    if (firstVisibleItem != null) {
        Application.Current.Dispatcher.BeginInvoke (DispatcherPriority.Loaded, new Action (delegate () {
            listBox1.ScrollIntoViewTop (firstVisibleItem);
        }));
    }
}


private void button3_Click(object sender, RoutedEventArgs e) 
{
    var firstVisibleItem = GetFirstVisibleItem(listBox1);
    listBox1.Items.Insert(0, "item19");
    listBox1.Items.Insert(0, "item20");
    listBox1.Items.Insert(0, "item21");
    listBox1.Items.Insert(0, "item22");
    listBox1.Items.Insert(0, "item23");
    listBox1.Items.Insert(0, "item24");
    listBox1.Items.Insert(0, "item25");
    listBox1.Items.Insert(0, "item26");
    listBox1.Items.Insert(0, "item27");
    if (firstVisibleItem != null)
    {
        Application.Current.Dispatcher.BeginInvoke(DispatcherPriority.Loaded, new Action(delegate() {
            listBox1.ScrollIntoViewTop(firstVisibleItem);
        }));
    }
}
