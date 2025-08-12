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
        if (m_freeList != null) {
            SharpDX.Direct3D11.Texture2D texture;
            for (int i = 0; i < m_freeList.Count; i++) {
                texture = m_freeList[i];
                texture.Dispose ();
            }
            m_freeList = null;
        }
        disposedValue = true;
    }
}
