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
    // Check if it's already checking something
    if (_isCheckingInProgress) 
        return;

    try {
        _isCheckingInProgress = true;
        GetAvailableFiles();
    }
    catch {
        // Show error message
        ShowErrorMsg();
    }
    finally {
        _isCheckingInProgress = false;
    }
}


