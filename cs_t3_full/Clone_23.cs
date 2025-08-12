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
      UnloadManagedResources ();
    }
    Close ();
    UnloadUnmanagedResources ();
    m_disposed = true;
}


