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
		if (!ProcessExists(processName))
		{
		    Console.WriteLine(string.Format("{0} process not found", processName));
		}
		else
		{
		    LogProcessCpuUsage(processName);
		}
		Thread.Sleep(250);
	    }
	}
	static bool ProcessExists(string processName){
	    return Process.GetProcessesByName(processName).Length > 0;
	}
	static void LogProcessCpuUsage(string processName){
	    Process p = Process.GetProcessesByName(processName)[0];
	    TimeSpan currentTotalProcessorTime = p.TotalProcessorTime;
	    DateTime currentTime = DateTime.Now;
	    double cpuUsage = (currentTotalProcessorTime.TotalMilliseconds - lastTotalProcessorTime.TotalMilliseconds) / currentTime.Subtract(lastTime).TotalMilliseconds / Convert.ToDouble(Environment.ProcessorCount);
	    Console.WriteLine(string.Format("{0} CPU: {1:0.0}%", processName, cpuUsage * 100));
	    lastTime = currentTime;
	    lastTotalProcessorTime = currentTotalProcessorTime;
}


