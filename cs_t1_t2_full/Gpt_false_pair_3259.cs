private void Dispose (bool disposing) {
    if (this.disposed)
        return;
    if (disposing && this.stream != null)
        this.stream.Dispose ();
    this.disposed = true;
}


private void Dispose(bool disposing) 
{
    if(this.disposed)
        return;
    if(disposing && this.stream != null)
    {
        this.stream.Dispose();
    }
    this.disposed = true;
}
