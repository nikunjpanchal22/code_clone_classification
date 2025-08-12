private void trvAvailableFiles_AfterCheck (object sender, TreeViewEventArgs e) {
    if (! _isCheckingInProgress) {
        _isCheckingInProgress = true;
        try {
            GetAvailableFiles ();
        }
        catch {
        }
        _isCheckingInProgress = false;
    }
}


 private void trvAvailableFiles_AfterCheck (object sender, TreeViewEventArgs e) {
    // Don't proceed if the checking is already in progress
    if (_isCheckingInProgress)
        return;

    // Set the flag and try to get available files
    _isCheckingInProgress = true;
    try {
        GetAvailableFiles();
    }
    // Catch any kind of exception
    catch (Exception ex) {
        // Log it and send notification
        Logger.LogError(ex);
        SendErrorNotification(ex);
    }
    // No matter catch or not, reset the checking flag
    finally {
        _isCheckingInProgress = false;
    }
}


