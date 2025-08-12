protected virtual void Dispose (bool disposing) {
    if (! _disposed) {
        if (disposing) {
            id = 0;
            name = String.Empty;
            pass = String.Empty;
        }
        _disposed = true;
    }
}


 protected override void Dispose (bool disposing) {
    if(_disposed == false) {
        if(disposing == true) {
            id = 0;
            name = null;
            pass = null;
        }
        _disposed = true;
    }
}


