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
    var bw = new BackgroundWorker();
    bw.DoWork += (sender, e) => {
        e.Result = new { Id = 42, Name = "John Doe" };
    };
    bw.RunWorkerCompleted += (sender, e) => {
        var result = (dynamic) e.Result;
        label1.Text = result.Id.ToString();
        label2.Text = result.Name;
    };
    bw.RunWorkerAsync();
}


