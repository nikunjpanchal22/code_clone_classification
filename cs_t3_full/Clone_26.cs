private void Dispose (bool disposing) {
    if (m_disposed)
        return;
    if (disposing) {
    }
    Close ();
    m_disposed = true;
}


 private void Dispose (bool disposing) {
    if (m_disposed)
        return;
    if (disposing) {
      DisposeManagedResources ();
    }
    Close ();
    DisposeUnmanagedResources ();
    m_disposed = true;
}


