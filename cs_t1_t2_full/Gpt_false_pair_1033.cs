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
            var window = (Window)typeof(WindowInteropHelper).InvokeMember("_window",
                                            BindingFlags.GetField | BindingFlags.Instance | BindingFlags.NonPublic,
                                            null, helper, null);
            try
            {
                typeof(Window).InvokeMember("SafeCreateWindow", 
                                            BindingFlags.InvokeMethod | BindingFlags.Instance | BindingFlags.NonPublic,
                                            null, window, null);
            }
            catch (MissingMethodException) 
            {
                typeof(Window).InvokeMember("CreateSourceWindow", 
                                            BindingFlags.InvokeMethod | BindingFlags.Instance | BindingFlags.NonPublic,
                                            null, window, new object[] { false });
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
            FieldInfo windowField = typeof(WindowInteropHelper).GetField("_window", BindingFlags.Instance | BindingFlags.NonPublic);
            var window = (Window) windowField.GetValue(helper);
            try {
                typeof(Window).InvokeMember("SafeCreateWindow", 
                                    BindingFlags.InvokeMethod | BindingFlags.Instance | BindingFlags.NonPublic, 
                                    null, window, null);
            }
            catch(MissingMethodException e)
            {
                typeof(Window).InvokeMember("CreateSourceWindow", 
                                    BindingFlags.InvokeMethod | BindingFlags.Instance | BindingFlags.NonPublic, 
                                    null, window, new object[] {false});
            }
        }
        return helper.Handle;
    }

 public static IntPtr EnsureHandle(this WindowInteropHelper helper)
{
    if(helper == null)
        throw new ArgumentNullException("helper");

    if(helper.Handle == IntPtr.Zero)
    {
        var window = (Window) typeof(WindowInteropHelper).GetField("_window", BindingFlags.Instance | BindingFlags.NonPublic).GetValue(helper);
        try
        {
            MethodInfo safeCreateWindow = typeof(Window).GetMethod("SafeCreateWindow", BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
            safeCreateWindow.Invoke(window, null);
        }
        catch(MissingMethodException ex)
        {
            MethodInfo createSourceWindow = typeof(Window).GetMethod("CreateSourceWindow", BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
            createSourceWindow.Invoke(window, new object[]{false});
        }
    }
    return helper.Handle;
}
