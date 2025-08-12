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


 static void Main (string[] args) 
{
    if (args != null && args.Any() && File.Exists(args[0])) 
    {
        try 
        {
            Assembly assembly = Assembly.ReflectionOnlyLoadFrom(args[0]);
            AssemblyName name = assembly.GetName();
            FileStream fileStream = File.Open("C:\\AssemblyInfo.txt", FileMode.Append);
            using (StreamWriter writer = new StreamWriter(fileStream))
            {
                writer.WriteLine("{0} - {1}", name.FullName, name.Version);
            }
        }
        catch (Exception ex)
        {
            throw;
        }
    }
}


