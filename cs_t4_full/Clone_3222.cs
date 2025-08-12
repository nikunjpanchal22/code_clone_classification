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





public void ExecuteAction(Form form, Action guiCommand) {
	    var timeout = _totalTimeout;
	    while (form.IsHandleCreated != true && timeout > 0) {
		Thread.Sleep(SLEEPING_STEP);
		timeout -= SLEEPING_STEP;
	    }

	    if (form.InvokeRequired) {
		form.Invoke(guiCommand);
	    } else {
		guiCommand();
	    }
}


