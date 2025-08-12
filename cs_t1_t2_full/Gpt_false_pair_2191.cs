private void ImplementLongRunningOperation () {
    int id;
    string name;
    Task.Factory.StartNew (() => {
        id = 42;
        name = "Jonh Doe";
    }).ContinueWith (t => {
        label1.Text = id.ToString ();
        label2.Text = name;
    }, TaskScheduler.FromSynchronizationContext);
}


 private void ImplementLongRunningOperation () {
    int id;
    string name;
    Task.Factory.StartNew(() => {
        id = 42;
        name = "John Doe";
    }, Cancellationtoken.None, TaskCreationOptions.None, SynchronizationContext.Current)
    .ContinueWith((t) => {
        label1.Text = id.ToString();
        label2.Text = name;
    });
}
