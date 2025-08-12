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





public void Execute(Form form, Action guiCommand) {
	   _timeout = _totalTimeout;
	   for (var i = 0; i < _timeout && !form.IsHandleCreated; i += SLEEPING_STEP) {
	       Thread.Sleep(SLEEPING_STEP);
	   }
	   if (form.InvokeRequired)
	       form.Invoke(guiCommand);
	   else
	       guiCommand();
}


