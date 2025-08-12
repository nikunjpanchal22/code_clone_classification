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
    // Exit early if the checking is in progress
    if (_isCheckingInProgress)
        return;

    // Set the flag and try to get files
    _isCheckingInProgress = true;
    try {
        GetAvailableFiles();
    }
    catch (Exception ex) {
        // Log error and show message
        Logger.LogError(ex);
        DisplayErrorMessage(ex);
    }
    finally {
        // Reset the flag
        _isCheckingInProgress = false;
    }
}


