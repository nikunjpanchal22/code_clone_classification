static void Main (string [] args) {
    string libreOfficePath = getLibreOfficePath ();
    ProcessStartInfo procStartInfo = new ProcessStartInfo (libreOfficePath, string.Format ("--convert-to pdf --nologo {0}", args [0]));
    procStartInfo.RedirectStandardOutput = true;
    procStartInfo.UseShellExecute = false;
    procStartInfo.CreateNoWindow = true;
    procStartInfo.WorkingDirectory = Environment.CurrentDirectory;
    Process process = new Process () {StartInfo = procStartInfo,};
    process.Start ();
    process.WaitForExit ();
    if (process.ExitCode != 0) {
        throw new LibreOfficeFailedException (process.ExitCode);
    }
}





static void Main(string[] args)
{
	  var processStartInfo = new ProcessStartInfo
	  {
	    FileName = getLibreOfficePath(),
	    Arguments = $"--convert-to pdf --nologo {args[0]}",
	    RedirectStandardOutput = true,
	    UseShellExecute = false,
	    CreateNoWindow = true,
	    WorkingDirectory = Environment.CurrentDirectory
	  };
	  using (var process = Process.Start(processStartInfo))
	  {
	    process.WaitForExit();
	    if(process.ExitCode != 0) throw new LibreOfficeFailedException(process.ExitCode);
	  }
}


