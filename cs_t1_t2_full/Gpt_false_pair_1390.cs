private static void Main () {
    _serialPortBytes = Encoding.ASCII.GetBytes ("Mimic a bunch of bytes from the serial port");
    _streamOfBytesFromPort = new MemoryStream (_serialPortBytes);
    _streamOfBytesFromPort.Position = 0;
    _cancelTaskSignalSource = new CancellationTokenSource ();
    _cancelTaskSignal = _cancelTaskSignalSource.Token;
    var readFromSerialPort = Task.Factory.StartNew (ReadStream, _cancelTaskSignal);
    readFromSerialPort.Wait (3000);
    Console.WriteLine ("Press enter to cancel the task");
    _cancelTaskSignalSource.Cancel ();
    Console.ReadLine ();
}



private static void Main () {
    _serialPortBytes = Encoding.ASCII.GetBytes ("Mimic a bunch of bytes from the serial port");
    _streamOfBytesFromPort = new MemoryStream (_serialPortBytes);
    _streamOfBytesFromPort.Position = 0;
    _cancelTaskSignalSource = new CancellationTokenSource ();
    _cancelTaskSignal = _cancelTaskSignalSource.Token;
    Task.Run(() => ReadStream(_cancelTaskSignal));
    Task.Delay(3000).Wait();
    Console.WriteLine ("Press enter to cancel the task");
    _cancelTaskSignalSource.Cancel ();
    Console.ReadLine ();
}
