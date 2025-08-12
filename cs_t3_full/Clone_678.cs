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
        foreach (Type type in assembly.GetTypes ())
        {

            var collMethods = type.GetMethods (BindingFlags.Static | BindingFlags.Public | BindingFlags.NonPublic).Where (x => x.GetCustomAttributes (false).Length > 0);
            foreach (var method in collMethods)
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


