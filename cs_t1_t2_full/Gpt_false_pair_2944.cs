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


static void Main (string [] args) {
    string assembly_filename = args.FirstOrDefault ();
    if (assembly_filename != null && File.Exists (assembly_filename)) {
        try {
            var library = Assembly.ReflectionOnlyLoadFrom (assembly_filename);
            var name = library.GetName ();
            using (var filestream_writer = File.AppendText ("C:\\AssemblyInfo.txt"))
            {
                filestream_writer.WriteLine ("{0} - {1}", name.FullName, name.Version);
            }}
        catch (Exception) {
            throw;
        }
    }
}
