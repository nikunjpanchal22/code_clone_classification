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
    var assemblyFilename = args.FirstOrDefault();
    if (assemblyFilename != null && File.Exists(assemblyFilename))
    {
        try
        {
            var assembly = Assembly.ReflectionOnlyLoadFrom(assemblyFilename);
            var name = assembly.GetName();
            StreamWriter sw = new StreamWriter("C:\\AssemblyInfo.txt", append:true);
            sw.WriteLine("{0} - {1}", name.FullName, name.Version);
            sw.Flush();
            sw.Close();
        }
        catch (Exception ex)
        {
            throw;
        }
    }
}


