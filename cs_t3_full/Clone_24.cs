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
      FreeUpManagedResources ();
    }
    Close ();
    FreeUpUnmanagedResources ();
    m_disposed = true;
}


