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
     bool checkLocked = false;
     lock (checkLock)
     {
         if (!_isCheckingInProgress)
         {
             checkLocked = true;
             _isCheckingInProgress = true;
         }
     }
     if (checkLocked)
     {
         try {
             GetAvailableFiles ();
         }catch {   
         }
         _isCheckingInProgress = false;
     }
}


