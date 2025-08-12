protected override void OnCollectionChanged (NotifyCollectionChangedEventArgs e) {
    if (suppressNotification)
        return;
    base.OnCollectionChanged (e);
    if (CollectionChanged != null) {
        CollectionChanged.Invoke (this, e);
    }
}


private void InvokeCollectionChanged(object sender, NotifyCollectionChangedEventArgs e)
{
    if (CollectionChanged == null) return;

    var delegates = CollectionChanged.GetInvocationList();
    foreach (var del in delegates)
    {
        del.DynamicInvoke(sender, e);
    }
}


