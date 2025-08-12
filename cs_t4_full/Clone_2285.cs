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
	    if (!_disposed)
	    {
		if (disposing)
		{
		    ResetValues();
		}
		_disposed = true;
	    }
	}
	private void ResetValues() 
	{
	   id = 0;
	   name = String.Empty;
	   pass = String.Empty;
}


