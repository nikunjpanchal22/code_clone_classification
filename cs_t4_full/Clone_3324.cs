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
    if (args != null) {
        StreamReader reader = args.Process.StandardOutput;
        char[] buffer = new char[args.ReadBufferSize];
        while (!reader.EndOfStream) {
            if (args.Exit) {
                return;
            }
            int read = reader.Read(buffer, 0, buffer.Length);
            args.IntermediateDataStore.Append(new string(buffer, 0, read));
        }
    }
}


