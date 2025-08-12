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
        Assembly assembly = Assembly.LoadFile (file);
        foreach (var method in assembly.GetTypes ().SelectMany (t => t.GetMethods ()))
        {
            DetectCollisions (method);
        }
    }
    catch (Exception e)
    {
        Console.WriteLine ("Error detecting collisions: {0}", e.Message);
    }
}
