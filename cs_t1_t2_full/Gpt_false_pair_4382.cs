private void Dispose (bool disposing) {
    if (! disposedValue) {
        if (disposing) {
        }
        if (m_freeStack != null) {
            SharpDX.Direct3D11.Texture2D texture;
            while (m_freeStack.TryPop (out texture)) {
                texture.Dispose ();
            }
            m_freeStack = null;
        }
        disposedValue = true;
    }
}


private void Dispose (bool disposing) {
    if (! disposedValue) {
        if (disposing) {
        }
        if (m_freeQueue != null) {
            SharpDX.Direct3D11.Texture2D texture;
            while (m_freeQueue.TryDequeue (out texture)) {
                texture.Dispose ();
            }
            m_freeQueue = null;
        }
        disposedValue = true;
    }
}
