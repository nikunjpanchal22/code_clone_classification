public void Execute (Form form, Action guiCommand) {
    _timeout = _totalTimeout;
    while (! form.IsHandleCreated) {
        if (_timeout <= 0)
            return;
        Thread.Sleep (SLEEPING_STEP);
        _timeout -= SLEEPING_STEP;
    }
    if (form.InvokeRequired)
        form.Invoke (guiCommand);
    else
        guiCommand ();
}


 public void Execute (Form form, Action guiCommand) {
    _timeout = _totalTimeout;
    do {
        if (_timeout <= 0)
            return;

        Thread.Sleep (SLEEPING_STEP);
        _timeout -= SLEEPING_STEP;

    } while (! form.IsHandleCreated);

    if (form.InvokeRequired)
        form.Invoke (guiCommand);
    else
        guiCommand ();
}
