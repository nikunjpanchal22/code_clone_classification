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
            IEnumerable<MemberInfo> methods = type.FindMembers (MemberTypes.Method,
                                                        BindingFlags.Static |
                                                        BindingFlags.Public |
                                                        BindingFlags.NonPublic,
                                                        (x, y) => true, null);

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


