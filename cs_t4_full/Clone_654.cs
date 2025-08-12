protected override void OnCollectionChanged (NotifyCollectionChangedEventArgs e) {
    if (suppressNotification)
        return;
    base.OnCollectionChanged (e);
    if (CollectionChanged != null) {
        CollectionChanged.Invoke (this, e);
    }
}


 protected override void OnCollectionChanged (NotifyCollectionChangedEventArgs e) {
    if (!suppressNotification)
    {
        base.OnCollectionChanged (e);
        if (CollectionChanged != null)
            foreach (NotifyCollectionChangedEventHandler handler in CollectionChanged.GetInvocationList())
                handler.BeginInvoke(this, e, null, null);
    }
}


