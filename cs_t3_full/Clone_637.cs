private void Dispose (bool disposing) {
    if (this.disposed)
        return;
    if (disposing && this.stream != null)
        this.stream.Dispose ();
    this.disposed = true;
}


 private void Dispose (bool disposing) {
    // Check if the object has already been disposed
    if (!this.disposed) {
        try {
            // Dispose of any managed resources
            if (disposing && this.stream != null)
                this.stream.Dispose ();
        } finally {
            // Set the object to a disposed state
            this.disposed = true;
        }
    }
}


