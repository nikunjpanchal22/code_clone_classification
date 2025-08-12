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
    lock(_lock)
    {
        if(!_isCheckingInProgress) 
        {
            _isCheckingInProgress = true;
            try
            {
                GetAvailableFiles ();
            }
            catch {

            }
            _isCheckingInProgress = false;
        }
    }
}


