protected override void OnCollectionChanged (NotifyCollectionChangedEventArgs e) {
    if (suppressNotification)
        return;
    base.OnCollectionChanged (e);
    if (CollectionChanged != null) {
        CollectionChanged.Invoke (this, e);
    }
}





protected override void OnCollectionChanged(NotifyCollectionChangedEventArgs e)
{
    if (!suppressNotification)
    {
        base.OnCollectionChanged(e);

        if (CollectionChanged != null)
            CollectionChanged(this, e);
    }
}


