static void Main (string [] args) {
    var assemblyFilename = args.FirstOrDefault ();
    if (assemblyFilename != null && File.Exists (assemblyFilename)) {
        try {
            var assembly = Assembly.ReflectionOnlyLoadFrom (assemblyFilename);
            var name = assembly.GetName ();
            using (var file = File.AppendText ("C:\\AssemblyInfo.txt"))
            {
                file.WriteLine ("{0} - {1}", name.FullName, name.Version);
            }}
        catch (Exception ex) {
            throw;
        }
    }
}


 static void Main(string[] args)
{
    if (args.Length > 0 && File.Exists(args[0]))
    {        
        Assembly assembly = Assembly.ReflectionOnlyLoadFrom(args[0]);
        string assemblyName = assembly.GetName().FullName;
        string version = assembly.GetName().Version.ToString();
       
        FileStream fs = File.OpenWrite("C:\\AssemblyInfo.txt");
        StreamWriter sw = new StreamWriter(fs);

        sw.WriteLine("{0} - {1}", assemblyName, version);

        sw.Flush();
        sw.Close();
    }
}


