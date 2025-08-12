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
    while (!form.IsHandleCreated && _totalTimeout > 0) {
        Thread.Sleep(SLEEPING_STEP);
        _totalTimeout -= SLEEPING_STEP;
    }

    if (_totalTimeout > 0) {
        if (form.InvokeRequired)
            form.Invoke(guiCommand);
        else 
            guiCommand();
    }
}


