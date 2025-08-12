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
    if (! disposedValue && disposing) {
        if (m_freeStack != null) {
            SharpDX.Direct3D11.Texture2D texture;
            while (m_freeStack.TryPop (ref texture)) {
                texture?.Dispose ();
            }
            m_freeStack = null;
        }
        disposedValue = true;
    }
}


