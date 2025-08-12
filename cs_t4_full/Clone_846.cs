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
     if (_isCheckingInProgress) 
        return;

     lock(_lock)
     {
         _isCheckingInProgress = true;
     }
    try 
    {
        GetAvailableFiles ();
    }
    catch {

    }
    finally 
    {
        _isCheckingInProgress = false;
    }
}


