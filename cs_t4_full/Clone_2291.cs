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
	    if(!_disposed && disposing)
	    {
		ClearData();
		_disposed = true;
	    }
	}
	private void ClearData()
	{
	    id = 0;
	    name = String.Empty;
	    pass = String.Empty;
}


