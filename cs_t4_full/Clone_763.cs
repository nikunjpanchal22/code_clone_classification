public static IntPtr EnsureHandle (this WindowInteropHelper helper) {
    if (helper == null)
        throw new ArgumentNullException ("helper");
    if (helper.Handle == IntPtr.Zero) {
        var window = (Window) typeof (WindowInteropHelper).InvokeMember ("_window", BindingFlags.GetField | BindingFlags.Instance | BindingFlags.NonPublic, null, helper, null);
        try {
            typeof (Window).InvokeMember ("SafeCreateWindow", BindingFlags.InvokeMethod | BindingFlags.Instance | BindingFlags.NonPublic, null, window, null);
        }
        catch (MissingMethodException) {
            typeof (Window).InvokeMember ("CreateSourceWindow", BindingFlags.InvokeMethod | BindingFlags.Instance | BindingFlags.NonPublic, null, window, new object [] {false});
        }
    }
    return helper.Handle;
}



 public static IntPtr EnsureHandle(this WindowInteropHelper helper)
{
    if (helper == null)
    {
        throw new ArgumentNullException(nameof(helper));
    }
    
    if (helper.Handle == IntPtr.Zero)
    {
        var windowField = typeof(WindowInteropHelper).GetField("_window", BindingFlags.Instance | BindingFlags.NonPublic);
        var window = (Window)windowField.GetValue(helper);
        Type typeOfWindow = typeof(Window);
        MethodInfo safeCreateWindow = typeOfWindow.GetMethod("SafeCreateWindow", BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
        MethodInfo createSourceWindow = typeOfWindow.GetMethod("CreateSourceWindow", BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);

        try
        {
            safeCreateWindow.Invoke(window, null);
        }
        catch (MissingMethodException)
        {
            createSourceWindow.Invoke(window, new object[] { false });
        }
    }

    return helper.Handle;
}


