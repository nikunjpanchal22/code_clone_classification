private static void OneTimeSetup () {
    try {
        Type stackFrameHelperType = typeof (object).Assembly.GetType ("System.Diagnostics.StackFrameHelper");
        MethodInfo getStackFramesInternal = Type.GetType ("System.Diagnostics.StackTrace, mscorlib").GetMethod ("GetStackFramesInternal", BindingFlags.Static | BindingFlags.NonPublic);
        if (getStackFramesInternal == null)
            return;
        DynamicMethod dynamicMethod = new DynamicMethod ("GetStackFrameHelper", typeof (object), new Type [0], typeof (StackTrace), true);
        ILGenerator generator = dynamicMethod.GetILGenerator ();
        generator.DeclareLocal (stackFrameHelperType);
        bool newDotNet = false;
        ConstructorInfo constructorInfo = stackFrameHelperType.GetConstructor (new Type [] {typeof (bool), typeof (Thread)});
        if (constructorInfo != null)
            generator.Emit (OpCodes.Ldc_I4_0);
        else {
            constructorInfo = stackFrameHelperType.GetConstructor (new Type [] {typeof (Thread)});
            if (constructorInfo == null)
                return;
            newDotNet = true;
        }
        generator.Emit (OpCodes.Ldnull);
        generator.Emit (OpCodes.Newobj, constructorInfo);
        generator.Emit (OpCodes.Stloc_0);
        generator.Emit (OpCodes.Ldloc_0);
        generator.Emit (OpCodes.Ldc_I4_0);
        if (newDotNet)
            generator.Emit (OpCodes.Ldc_I4_0);
        generator.Emit (OpCodes.Ldnull);
        generator.Emit (OpCodes.Call, getStackFramesInternal);
        generator.Emit (OpCodes.Ldloc_0);
        generator.Emit (OpCodes.Ret);
        _getStackFrameHelper = (DGetStackFrameHelper) dynamicMethod.CreateDelegate (typeof (DGetStackFrameHelper));
        _frameCount = stackFrameHelperType.GetField ("iFrameCount", BindingFlags.NonPublic | BindingFlags.Instance);
    }
    catch {
    }
}



private static void OneTimeSetup() 
{ 
    try 
    { 
        Type stackFrameHelperType
            = typeof(object).Assembly.GetType("System.Diagnostics.StackFrameHelper"); 
        MethodInfo getStackFramesInternal 
            = Type.GetType("System.Diagnostics.StackTrace, mscorlib").GetMethod("GetStackFramesInternal", BindingFlags.Static | BindingFlags.NonPublic); 
        if (getStackFramesInternal == null) 
            return; 
        DynamicMethod dynamicMethod = new DynamicMethod("GetStackFrameHelper", typeof(object), new Type[0], typeof(StackTrace), true); 
        ILGenerator generator = dynamicMethod.GetILGenerator(); 
        generator.DeclareLocal(stackFrameHelperType); 
        bool newDotNet = false; 
        ConstructorInfo constructorInfo
            = stackFrameHelperType.GetConstructor(new Type[] { typeof(bool), typeof(Thread) }); 
        if (constructorInfo != null) 
            generator.Emit(OpCodes.Ldc_I4_0); 
        else 
        { 
            constructorInfo = stackFrameHelperType.GetConstructor(new Type[] { typeof(Thread) }); 
            if (constructorInfo == null) 
                return; 
            newDotNet = true; 
        } 
        generator.Emit(OpCodes.Ldnull); 
        generator.Emit(OpCodes.Newobj, constructorInfo); 
        generator.Emit(OpCodes.Stloc_0); 
        generator.Emit(OpCodes.Ldloc_0); 
        if (newDotNet) 
            generator.Emit(OpCodes.Ldc_I4_0); 
        else 
            generator.Emit(OpCodes.Ldc_I4_1); 
        generator.Emit(OpCodes.Ldnull); 
        generator.Emit(OpCodes.Call, getStackFramesInternal); 
        generator.Emit(OpCodes.Ldloc_0); 
        generator.Emit(OpCodes.Ret); 
        _getStackFrameHelper 
            = (DGetStackFrameHelper)dynamicMethod.CreateDelegate(typeof(DGetStackFrameHelper)); 
        _frameCount
            = stackFrameHelperType.GetField("iFrameCount", BindingFlags.NonPublic | BindingFlags.Instance); 
    } 
    catch 
    { 
    } 
}
