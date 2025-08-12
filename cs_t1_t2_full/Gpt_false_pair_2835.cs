static void Main (string [] args) {
    string processName = "OUTLOOK";
    Console.WriteLine ("Press the any key to stop...\n");
    while (! Console.KeyAvailable) {
        Process [] pp = Process.GetProcessesByName (processName);
        if (pp.Length == 0) {
            Console.WriteLine (processName + " does not exist");
        } else {
            Process p = pp [0];
            if (lastTime == null || lastTime == new DateTime ()) {
                lastTime = DateTime.Now;
                lastTotalProcessorTime = p.TotalProcessorTime;
            } else {
                curTime = DateTime.Now;
                curTotalProcessorTime = p.TotalProcessorTime;
                double CPUUsage = (curTotalProcessorTime.TotalMilliseconds - lastTotalProcessorTime.TotalMilliseconds) / curTime.Subtract (lastTime).TotalMilliseconds / Convert.ToDouble (Environment.ProcessorCount);
                Console.WriteLine ("{0} CPU: {1:0.0}%", processName, CPUUsage * 100);
                lastTime = curTime;
                lastTotalProcessorTime = curTotalProcessorTime;
            }
        }
        Thread.Sleep (250);
    }
}


static void Main (string [] args) {
    string procName = "OUTLOOK";
    Console.WriteLine ("Press any key to stop...\n");
    while (! Console.KeyAvailable) {
        Process [] p = Process.GetProcessesByName (procName);
        if (p.Length == 0) {
            Console.WriteLine (procName + " does not exist");
        } else {
            Process pro = p [0];
            if (lastTimer == null || lastTimer == new DateTime ()) {
                lastTimer = DateTime.Now;
                lastTotalProcessorTimer = pro.TotalProcessorTime;
            } else {
                currently = DateTime.Now;
                currTotalProcessorTime = pro.TotalProcessorTime;
                double CPU = (currTotalProcessorTime.TotalMilliseconds - lastTotalProcessorTimer.TotalMilliseconds) / currently.Subtract (lastTimer).TotalMilliseconds / Convert.ToDouble (Environment.ProcessorCount);
                Console.WriteLine ("{0} CPU: {1:0.0}%", procName, CPU * 100);
                lastTimer = currently;
                lastTotalProcessorTimer = currTotalProcessorTime;
            }
        }
        Thread.Sleep (250);
    }
}
