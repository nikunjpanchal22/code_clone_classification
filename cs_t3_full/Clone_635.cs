private void Dispose (bool disposing) {
    if (this.disposed)
        return;
    if (disposing && this.stream != null)
        this.stream.Dispose ();
    this.disposed = true;
}


 private void Dispose (bool disposing) {
    try {
        if (this.disposed) 
            return; 
        else if (disposing && this.stream != null)
            this.stream.Dispose (); 
    } finally {
        this.disposed = true;
    }
}


