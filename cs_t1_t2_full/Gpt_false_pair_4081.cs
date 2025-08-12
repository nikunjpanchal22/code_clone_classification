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
    ProcessOutputReaderWorkerThreadArguments args;
    try {
        args = (ProcessOutputReaderWorkerThreadArguments) data;
    }
    catch {
        return;
    }
    try {
     char [] readBuffer = new char [args.ReadBufferLength];
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
         int readBytes = args.Process.StandardOutput.Read (readBuffer, 0, readBuffer.Length);
         args.IntermediateDataStore.Append (readBuffer, 0, readBytes);
         this.FireOnDataRead (new StringBuilder (readBuffer, 0, readBytes));
     }
    }
    catch (ThreadAbortException) {
        if (! args.Process.HasExited) {
            args.Process.Kill ();
        }
    }
}
