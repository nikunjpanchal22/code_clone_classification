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
            foreach (MethodInfo method in type.DeclaredMethods)
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


