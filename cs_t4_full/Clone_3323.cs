private void ReaderWorker (object data) {
    ProcessOutputReaderWorkerThreadArguments args;
    try {
        args = (ProcessOutputReaderWorkerThreadArguments) data;
    }
    catch {
        return;
    }
    try {
        char [] readBuffer = new char [args.ReadBufferSize];
        while (! args.Exit) {
            if (args.Process == null) {
                return;
            }
            if (args.Process.HasExited) {
                return;
            }
            if (args.Process.StandardOutput.EndOfStream) {
                return;
            }
            int readBytes = this.Process.StandardOutput.Read (readBuffer, 0, readBuffer.Length);
            args.IntermediateDataStore.Append (readBuffer, 0, readBytes);
            this.FireOnDataRead (new String (readBuffer, 0, readBytes));
        }
    }
    catch (ThreadAbortException) {
        if (! args.Process.HasExited) {
            args.Process.Kill ();
        }
    }
}






private void ReaderWorker (object data) {
    var args = data as ProcessOutputReaderWorkerThreadArguments;
    if (args == null) {
        throw new ArgumentNullException("data");
    }
    Stream stream = args.Process.StandardOutput;
    while (! args.Exit) {
        byte[] buffer = new byte[args.ReadBufferSize];
        int bytesRead = stream.Read(buffer, 0, buffer.Length);
        if (bytesRead == 0) {
            break;
        }
        args.IntermediateDataStore.Append(System.Text.Encoding.Default.GetString(buffer, 0, bytesRead));
    }
}


