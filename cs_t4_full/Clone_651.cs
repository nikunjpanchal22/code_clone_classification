protected override void OnCollectionChanged (NotifyCollectionChangedEventArgs e) {
    if (suppressNotification)
        return;
    base.OnCollectionChanged (e);
    if (CollectionChanged != null) {
        CollectionChanged.Invoke (this, e);
    }
}


 protected override void OnCollectionChanged(NotifyCollectionChangedEventArgs e) {
    if (!suppressNotification)
    {
        base.OnCollectionChanged(e);
        var handler = CollectionChanged;
        if (handler != null)
        {
            var invocations = handler.GetInvocationList();
            foreach (var invocation in invocations)
            {
                var asyncCallback = new AsyncCallback((callbackResult) =>
                {
                    var asyncState = (Tuple<NotifyCollectionChangedEventHandler, NotifyCollectionChangedEventArgs>)callbackResult.AsyncState;
                    asyncState.Item1.EndInvoke(callbackResult); ;
                });
                var asyncClosureState = new Tuple<NotifyCollectionChangedEventHandler, NotifyCollectionChangedEventArgs>(invocation as NotifyCollectionChangedEventHandler, e);
                invocation.BeginInvoke(this, e, asyncCallback, asyncClosureState);
            }
        }
    }
}


