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


 static void Main (string [] args)
{
    if (args.Length > 0)
    {
        var assemblyFilename = args[0];
        if (File.Exists(assemblyFilename))
        {
            try
            {
                var assemblyName = Assembly.ReflectionOnlyLoadFrom(assemblyFilename).GetName();
                using (StreamWriter sw = new StreamWriter("C:\\AssemblyInfo.txt", true))
                {
                    sw.WriteLine("{0} - {1}", assemblyName.FullName, assemblyName.Version);
                }
            }
            catch (Exception e)
            {
                throw;
            }
        }
    }
}


