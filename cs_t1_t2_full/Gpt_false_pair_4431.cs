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


public static void Main () {
    _serialPortBytes = Encoding.ASCII.GetBytes ("Mimic a bunch of bytes from the serial port");
    _streamOfBytesFromPort = new MemoryStream (_serialPortBytes);
    _streamOfBytesFromPort.Position = 0;
    _stoppingSignalSource = new CancellationTokenSource ();
    _stoppingSignal = _stoppingSignalSource.Token;
    var readFromSerialPort = Task.Run (() => ReadStream (_stoppingSignal));
    readFromSerialPort.Wait (3000);
    Console.WriteLine ("Press enter to stop the task");
    _stoppingSignalSource.Cancel ();
    Console.ReadLine ();
}
