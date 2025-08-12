private void Dispose (bool disposing) {
    if (this.disposed)
        return;
    if (disposing && this.stream != null)
        this.stream.Dispose ();
    this.disposed = true;
}


 private void Dispose(bool disposing) {
	// Check if the object has already been disposed of
	if (this.disposed) {
		return;
	}
	// Perform disposing logic, if necessary
	if (disposing && this.stream != null) {
		try {
			this.stream.Dispose();
		} catch {
			// Throw any exceptions, but dispose of the object no matter what
			this.disposed = true;
		}
	}
	// Set the object to a disposed state
	this.disposed = true;
}


