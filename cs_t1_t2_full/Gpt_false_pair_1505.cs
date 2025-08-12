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
    Console.ForegroundColor = ConsoleColor.DarkBlue;
    Console.WriteLine ("Split Analyser Activates");
    Console.ForegroundColor = ConsoleColor.White;
    Console.WriteLine ("Press Esc to cancel.....");
    Thread MainThread = new Thread (new ThreadStart (ThreadProcess));
    Thread ConsoleKeyListener = new Thread (new ThreadStart (ListenToKeyboard));
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
