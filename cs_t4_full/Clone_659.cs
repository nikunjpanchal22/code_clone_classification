private void Dispose (bool disposing) {
    if (this.disposed)
        return;
    if (disposing && this.stream != null)
        this.stream.Dispose ();
    this.disposed = true;
}


 private void Dispose(bool disposing) {
	// Only perform disposing logic if we haven't already
	if (!disposed) {
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


