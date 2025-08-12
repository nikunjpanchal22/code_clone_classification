private void Dispose (bool disposing) {
    if (this.disposed)
        return;
    if (disposing && this.stream != null)
        this.stream.Dispose ();
    this.disposed = true;
}


 private void Dispose (bool disposing) {
    // If the object has not yet been disposed, then run the disposing logic
    if (!this.disposed) {
        if (disposing && this.stream != null) {
            this.stream.Dispose ();   
        }
    }
    // Set the object to a disposed state
    this.disposed = true;
}


