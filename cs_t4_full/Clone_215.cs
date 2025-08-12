private void button2_Click (object sender, RoutedEventArgs e) {
    var firstVisibleItem = GetFirstVisibleItem (listBox1);
    listBox1.Items.Insert (0, "item7");
    listBox1.Items.Insert (0, "item8");
    listBox1.Items.Insert (0, "item9");
    listBox1.Items.Insert (0, "item10");
    listBox1.Items.Insert (0, "item11");
    listBox1.Items.Insert (0, "item12");
    listBox1.Items.Insert (0, "item13");
    listBox1.Items.Insert (0, "item14");
    listBox1.Items.Insert (0, "item15");
    if (firstVisibleItem != null) {
        Application.Current.Dispatcher.BeginInvoke (DispatcherPriority.Loaded, new Action (delegate () {
            listBox1.ScrollIntoViewTop (firstVisibleItem);
        }));
    }
}


 private void button2_Click (object sender, RoutedEventArgs e) {
    var firstVisibleItem = GetFirstVisibleItem (listBox1);
    for (int i = 14; i >= 5; --i) {
        listBox1.Items.Insert(0, "item" + i);
    }
    if (firstVisibleItem != null) {
        Application.Current.Dispatcher.BeginInvoke (DispatcherPriority.Loaded, new Action (delegate () {
            listBox1.ScrollIntoViewTop (firstVisibleItem);
        }));
    }
}


