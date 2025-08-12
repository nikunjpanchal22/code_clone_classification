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


private static void CheckCollisions (string file) {
    try {
        Assembly assembly = Assembly.LoadFrom (file);
        foreach (var method in FindExtensionMethods (assembly)) {
            CheckCollisions (method);
        }
    }
    catch (Exception e) {
        Console.WriteLine ("Error in checking collisions: {0}", e.Message);
    }
}
