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
    if (! _isCheckingInProgress) 
    { 
        bool success = false;
        try { 
            _isCheckingInProgress = true; 
            GetAvailableFiles (); 
            success = true;
        } 
        finally {
            _isCheckingInProgress = success; 
       }
    } 
}


