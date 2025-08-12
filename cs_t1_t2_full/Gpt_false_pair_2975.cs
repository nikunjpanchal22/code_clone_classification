static void Main (string [] args) {
    string assemblyName = Path.Combine (Path.GetTempPath (), string.Format ("temp{0}.dll", Guid.NewGuid ()));
    CSharpCodeProvider codeProvider = new CSharpCodeProvider ();
    CompilerParameters compilerParameters = new CompilerParameters (new string [] {"System.dll", "Microsoft.CSharp.dll",}, assemblyName);
    CompilerResults cr = codeProvider.CompileAssemblyFromSource (compilerParameters, File.ReadAllText ("Program.cs"));
    if (cr.Errors.Count > 0) {
        foreach (CompilerError error in cr.Errors) {
            Console.WriteLine (error.ErrorText);
        }
    } else {
        AppDomain appDomain = AppDomain.CreateDomain ("volatile");
        Proxy p = (Proxy) appDomain.CreateInstanceAndUnwrap (Assembly.GetExecutingAssembly ().FullName, typeof (Proxy).FullName);
        p.ShowTypesStructure (assemblyName);
        AppDomain.Unload (appDomain);
        File.Delete (assemblyName);
    }
    Console.ReadLine ();
}


static void Main (string [] args) {
    string assemblyName = Path.Combine (Path.GetTempPath (), string.Format ("temp{0}.dll", Guid.NewGuid ()));
    CSharpCodeProvider codeProvider = new CSharpCodeProvider ();
    CompilerParameters compilerParameters = new CompilerParameters (new string [] {"System.dll","Microsoft.VisualBasic.dll",}, assemblyName);
    CompilerResults cr = codeProvider.CompileAssemblyFromSource (compilerParameters, File.ReadAllText ("Application.vb"));
    if (cr.Errors.Count > 0) {
        foreach (CompilerError error in cr.Errors) {
            Console.WriteLine (error.ErrorText);
        }
    } else {
        AppDomain appDomain = AppDomain.CreateDomain ("volatile");
        Proxy p = (Proxy) appDomain.CreateInstanceAndUnwrap (Assembly.GetExecutingAssembly ().FullName, typeof (Proxy).FullName);
        p.ShowTypesStructure (assemblyName);
        AppDomain.Unload (appDomain);
        File.Delete (assemblyName);
    }
    Console.WriteLine("Press any key to exit...");
    Console.ReadLine ();
}
