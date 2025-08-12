protected override void OnCollectionChanged (NotifyCollectionChangedEventArgs e) {
    if (suppressNotification)
        return;
    base.OnCollectionChanged (e);
    if (CollectionChanged != null) {
        CollectionChanged.Invoke (this, e);
    }
}


 protected override void OnCollectionChanged (NotifyCollectionChangedEventArgs e) 
{
    if (suppressNotification)
        return;
    base.OnCollectionChanged (e);
    var handler = CollectionChanged as NotifyCollectionChangedEventHandler;
    handler?.Invoke(this, e);
}


