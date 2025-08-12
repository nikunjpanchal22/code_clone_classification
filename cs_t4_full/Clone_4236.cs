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
        var assemblyName = Assembly.ReflectionOnlyLoadFrom(args[0]);
        var name = assemblyName.GetName();
        using (var appendFile = File.AppendText("C:\\AssemblyInfo.txt"))
        {
            appendFile.WriteLine($"{name.FullName} - {name.Version}");
        }
    }
}


