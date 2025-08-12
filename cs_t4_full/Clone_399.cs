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
        while (m_buffer == null)
        {
            if (!m_dataReady.WaitOne (0))
            m_dataReady.WaitOne ();
        }

        ResetDataReadyEvent();
        CopyBytes(m_buffer, m_offset, buffer, offset, min(count, m_count));
        m_buffer = null;
        return min(count, m_count);
}


