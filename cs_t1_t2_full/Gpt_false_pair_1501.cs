static void Main (string [] args) {
    Console.ForegroundColor = ConsoleColor.Green;
    Console.WriteLine ("Split Analyser starts");
    Console.ForegroundColor = ConsoleColor.Red;
    Console.WriteLine ("Press Esc to quit.....");
    Thread MainThread = new Thread (new ThreadStart (startProcess));
    Thread ConsoleKeyListener = new Thread (new ThreadStart (ListerKeyBoardEvent));
    MainThread.Name = "Processor";
    ConsoleKeyListener.Name = "KeyListener";
    MainThread.Start ();
    ConsoleKeyListener.Start ();
    while (true) {
        if (Terminate) {
            Console.WriteLine ("Terminating Process...");
            MainThread.Abort ();
            ConsoleKeyListener.Abort ();
            Thread.Sleep (2000);
            Thread.CurrentThread.Abort ();
            return;
        }
        if (stopProcessor) {
            Console.WriteLine ("Ending Process...");
            MainThread.Abort ();
            ConsoleKeyListener.Abort ();
            Thread.Sleep (2000);
            Thread.CurrentThread.Abort ();
            return;
        }
    }
}


 static void Main (string[] args) 
{
    Console.ForegroundColor = ConsoleColor.Magenta;
    Console.WriteLine("Split Analyser Begins");
    Console.ForegroundColor = ConsoleColor.Yellow;
    Console.WriteLine("Press Esc to exit.....");
    Thread MainThread = new Thread (new ParameterizedThreadStart (RunProcess));
    Thread ConsoleKeyListener = new Thread (new ParameterizedThreadStart (WatchKeyboardEvent));
    MainThread.Name = "Processor";
    ConsoleKeyListener.Name = "KeyListener";
    MainThread.Start ();
    ConsoleKeyListener.Start ();
    while (true) {
        if (Terminate) {
            Console.WriteLine ("Terminating Process...");
            MainThread.Abort ();
            ConsoleKeyListener.Abort ();
            Thread.Sleep (2000);
            Thread.CurrentThread.Abort ();
            return;
        }
        if (stopProcessor) {
            Console.WriteLine ("Ending Process...");
            MainThread.Abort ();
            ConsoleKeyListener.Abort ();
            Thread.Sleep (2000);
            Thread.CurrentThread.Abort ();
            return;
        }
    }
}
