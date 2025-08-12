public override int Read (byte [] buffer, int offset, int count) {
    if (m_buffer == null) {
        m_dataReady.Reset ();
        m_dataReady.WaitOne ();
    }
    Buffer.BlockCopy (m_buffer, m_offset, buffer, offset, (count < m_count) ? count : m_count);
    m_buffer = null;
    return (count < m_count) ? count : m_count;
}


 public override int Read (byte [] buffer, int offset, int count) {
        m_dataReady.WaitOne(); 
        ReleaseDataReadyEvent();
        int length = (count < m_count) ? count : m_count;
        CopyBytes(m_buffer, m_offset, buffer, offset, length);
        m_buffer = null;
        return length;
}


