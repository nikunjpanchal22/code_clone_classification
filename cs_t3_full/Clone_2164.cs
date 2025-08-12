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
  string libreOfficePath = getLibreOfficePath();
  var psi = new ProcessStartInfo(libreOfficePath, string.Format("--convert-to pdf --nologo {0}", args[0]));
  psi.RedirectStandardOutput = true;
  psi.UseShellExecute = false;
  psi.CreateNoWindow = true;
  psi.WorkingDirectory = Environment.CurrentDirectory;
  
  var process = Process.Start(psi);
  process.WaitForExit();
  if (process.ExitCode != 0) throw new LibreOfficeFailedException(process.ExitCode);
}


