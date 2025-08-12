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


 static void Main (string [] args) {
    Console.ForegroundColor = ConsoleColor.DarkGray;
    Console.WriteLine ("Split Analyser Initializes");
    Console.ForegroundColor = ConsoleColor.Blue;
    Console.WriteLine ("Press Esc to finish.....");
    Thread MainThread = new Thread (Execute);
    Thread ConsoleKeyListener = new Thread (CheckKeyBoard);
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
