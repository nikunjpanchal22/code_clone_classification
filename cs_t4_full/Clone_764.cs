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


 public static IntPtr EnsureHandle (this WindowInteropHelper helper)
{
    if (helper == null)
    {
        throw new ArgumentNullException("helper");
    }

    if (helper.Handle == IntPtr.Zero)
    {
        var windowField = typeof(WindowInteropHelper).GetField("_window", BindingFlags.Instance | BindingFlags.NonPublic);
        var window = (Window)windowField.GetValue(helper);
        var safeCreateWindowMethod = typeof(Window).GetMethod("SafeCreateWindow", BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
        var createSourceWindowMethod = typeof(Window).GetMethod("CreateSourceWindow", BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);

        try
        {
            safeCreateWindowMethod.Invoke(window, null);
        }
        catch (MissingMethodException)
        {
            createSourceWindowMethod.Invoke(window, new object[] { false });
        }
    }

    return helper.Handle;
}


