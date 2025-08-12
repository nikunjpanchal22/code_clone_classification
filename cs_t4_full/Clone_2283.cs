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




protected virtual void Dispose(bool disposing)
{
    if(_disposed) return;
    if(!disposing) return;

    id = 0;
    name = string.Empty;
    pass = string.Empty;
    _disposed = true;
}


