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



 

protected virtual void Dispose (bool disposing) {
    if (! _disposed) {
        if (disposing) {
            id = null;
            name = null;
            pass = null;
        }
        _disposed = true;
    }
}


