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
    if (!form.IsHandleCreated) {
        while (_timeout > 0) {
            Thread.Sleep (SLEEPING_STEP);
            _timeout -= SLEEPING_STEP;
        }
        if (_timeout == 0)
            return;
    }

    if (form.InvokeRequired)
        form.Invoke (guiCommand);
    else
        guiCommand ();
}


