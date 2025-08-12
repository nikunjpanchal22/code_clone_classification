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
    if (args != null && args.Length > 0 && File.Exists(args[0])) 
    {
        try
        {
            Assembly assembly = Assembly.ReflectionOnlyLoadFrom(args[0]);
            AssemblyName name = assembly.GetName();
            StreamWriter writer = null;
            try
            {
                writer = new StreamWriter("C:\\AssemblyInfo.txt", append: true);
                writer.WriteLine("{0} - {1}", name.FullName, name.Version);
            }
            finally
            {
                writer?.Dispose();
            }
        }
        catch (Exception ex)
        {
            throw;
        }
    }
}


