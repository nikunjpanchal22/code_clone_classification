private void Dispose (bool disposing) {
    if (this.disposed)
        return;
    if (disposing && this.stream != null)
        this.stream.Dispose ();
    this.disposed = true;
}


 private void Dispose(bool disposing) {
	// Synchronize access to the disposed field
	lock (this.disposedLock) {
		// Check if the object has already been disposed
		if (this.disposed) {
			return;
		}
		// Perform disposing logic if necessary
		if (disposing && this.stream != null) {
			try {
				this.stream.Dispose();
			} finally {
				this.disposed = true;
				// No need to dispose of other elements because there are none
			}
		}
	}
}


