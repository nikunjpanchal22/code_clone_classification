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
		    string processName = "OUTLOOK";
		    Console.WriteLine("Press the any key to stop...\n");
		    while (!Console.KeyAvailable)
		    {
			Process[] processList = Process.GetProcessesByName(processName);
			if (processList.Length == 0)
			{
			    Console.WriteLine(processName + " process not found");
			}
			else
			{
			    Process process = processList[0];
			    CPUUsage(process, processName);
			}
			Thread.Sleep(250);
		    }
		}
		static void CPUUsage(Process process, string processName)
		{
		    if (lastTime == null || lastTime == new DateTime())
		    {
			lastTime = DateTime.Now;
			lastTotalProcessorTime = process.TotalProcessorTime;
		    }
		    else
		    {
			DateTime currentTime = DateTime.Now;
			TimeSpan currentTotalProcessorTime = process.TotalProcessorTime;
			double cpuUsagePercentage = CalculateCPUUsage(currentTime, currentTotalProcessorTime);
			Console.WriteLine("{0} CPU: {1:0.0}%", processName, cpuUsagePercentage * 100);
			lastTime = currentTime;
			lastTotalProcessorTime = currentTotalProcessorTime;
		    }
		}
		static double CalculateCPUUsage(DateTime currentTime, TimeSpan currentTotalProcessorTime)
		{
		    return (currentTotalProcessorTime.TotalMilliseconds - lastTotalProcessorTime.TotalMilliseconds) / currentTime.Subtract(lastTime).TotalMilliseconds / Convert.ToDouble(Environment.ProcessorCount);
}


