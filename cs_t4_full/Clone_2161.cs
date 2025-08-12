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





static void Main(string[] args)
{
	    const string processName = "OUTLOOK";
	    Console.WriteLine("Press any key to stop...\n");
	    while (!Console.KeyAvailable)
	    {
		var processList = Process.GetProcessesByName(processName);
		if (processList.Length == 0)
		{
		    Console.WriteLine("{0} process not found", processName);
		}
		else {
		    UpdateCPULoad(processList[0], processName);
		}
		Thread.Sleep(250);
	    }
	}

	static void UpdateCPULoad(Process process, string processName)
	{
	     DateTime currentTime = DateTime.Now;
	    TimeSpan currentProcessorUsage = process.TotalProcessorTime;
	    double CPULoad = (currentProcessorUsage.TotalMilliseconds - lastTotalProcessorTime.TotalMilliseconds) / currentTime.Subtract(lastTime).TotalMilliseconds / Convert.ToDouble(Environment.ProcessorCount);
	    Console.WriteLine("{0} CPU: {1:0.0}%", processName, CPULoad * 100);
	    lastTime = currentTime;
	    lastTotalProcessorTime = currentProcessorUsage;
}


