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
    /*
        Initializing m_dataReady to a new instance of 
        ManualResetEvent with false value.
    */
    ManualResetEvent m_dataReady = new ManualResetEvent (false);
    if (m_buffer == null) {
        //Resetting the event and waiting.
        m_dataReady.Reset ();
        m_dataReady.WaitOne ();
    } 
    //Copying data from m_buffer to buffer.
    Buffer.BlockCopy (m_buffer, m_offset, buffer, offset, (count < m_count) ? count : m_count);
    //Reassigning m_buffer to null
    m_buffer = null;
    return (count < m_count) ? count : m_count;
}
