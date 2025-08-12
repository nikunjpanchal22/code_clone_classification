private static void DetectCollisions (string file) {
    try {
        Assembly assembly = Assembly.LoadFrom (file);
        foreach (var method in FindExtensionMethods (assembly)) {
            DetectCollisions (method);
        }
    }
    catch (Exception e) {
        Console.WriteLine ("Error detecting collisions: {0}", e.Message);
    }
}


  private static void DetectCollisions (string file)
{
    try
    {
        Assembly assembly = Assembly.LoadFrom (file);
        foreach (TypeInfo type in assembly.DefinedTypes)
        {
            IEnumerable<MethodInfo> methods = type.DeclaredMethods.Where (x => Attribute.IsDefined (x, typeof (ExtensionAttribute)));
            foreach (var method in methods)
            {
                DetectCollisions (method);
            }
        }
    }
    catch (Exception e)
    {
        Console.WriteLine ("Error detecting collisions: {0}", e.Message);
    }
}


