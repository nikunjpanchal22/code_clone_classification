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
            userID = 0;
            userName = String.Empty;
            userPass = String.Empty;
        }
        _disposed = true;
    }
}
