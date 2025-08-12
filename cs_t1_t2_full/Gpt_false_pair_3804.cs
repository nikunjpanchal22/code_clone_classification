private static void OneTimeSetup () {
    Type stackFrameHelperType = typeof (object).Assembly.GetType ("System.Diagnostics.StackFrameHelper");
    MethodInfo getStackFramesInternal = Type.GetType ("System.Diagnostics.StackTrace, mscorlib").GetMethod ("GetStackFramesInternal", BindingFlags.Static | BindingFlags.NonPublic);
    DynamicMethod dynamicMethod = new DynamicMethod ("GetStackFrameHelper", typeof (object), new Type [0], typeof (StackTrace), true);
    ILGenerator generator = dynamicMethod.GetILGenerator ();
    generator.DeclareLocal (stackFrameHelperType);
    generator.Emit (OpCodes.Ldc_I4_0);
    generator.Emit (OpCodes.Ldnull);
    generator.Emit (OpCodes.Newobj, stackFrameHelperType.GetConstructor (new Type [] {typeof (bool), typeof (Thread)}));
    generator.Emit (OpCodes.Stloc_0);
    generator.Emit (OpCodes.Ldloc_0);
    generator.Emit (OpCodes.Ldc_I4_0);
    generator.Emit (OpCodes.Ldnull);
    generator.Emit (OpCodes.Call, getStackFramesInternal);
    generator.Emit (OpCodes.Ldloc_0);
    generator.Emit (OpCodes.Ret);
    _getStackFrameHelper = (DGetStackFrameHelper) dynamicMethod.CreateDelegate (typeof (DGetStackFrameHelper));
    _frameCount = stackFrameHelperType.GetField ("iFrameCount", BindingFlags.NonPublic | BindingFlags.Instance);
}


private static void OneTimeSetup () {
    Type stackFrameHelperType = typeof (object).Assembly.GetType ("System.Diagnostics.StackFrameHelper");
    MethodInfo getStackFramesInternal = Type.GetType ("System.Diagnostics.StackTrace, mscorlib").GetMethod ("GetStackFramesInternal", BindingFlags.Static | BindingFlags.NonPublic);
    DynamicMethod dynamicMethod = new DynamicMethod ("GetStackFrameHelper", typeof (object), new Type [0], typeof (StackTrace), true);
    ILGenerator generator = dynamicMethod.GetILGenerator ();
    generator.DeclareLocal (stackFrameHelperType);
    generator.Emit (OpCodes.Ldc_I4_0);
    generator.Emit (OpCodes.Ldnull);
    generator.Emit (OpCodes.Call, getStackFramesInternal);
    generator.Emit (OpCodes.Newobj, stackFrameHelperType.GetConstructor (new Type [] {typeof (bool), typeof (Thread)}));
    generator.Emit (OpCodes.Stloc_0);
    generator.Emit (OpCodes.Ldloc_0);
    generator.Emit (OpCodes.Ret);
    _getStackFrameHelper = (DGetStackFrameHelper) dynamicMethod.CreateDelegate (typeof (DGetStackFrameHelper));
    _frameCount = stackFrameHelperType.GetField ("iFrameCount", BindingFlags.NonPublic | BindingFlags.Instance);
}
