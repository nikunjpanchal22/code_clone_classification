public static void Dispose (this MethodBuilder mb) {
    if (mb == null)
        return;
    Type mbType = typeof (MethodBuilder);
    FieldInfo mbILGen = mbType.GetField ("m_ilGenerator", BindingFlags.Instance | BindingFlags.NonPublic);
    FieldInfo mbMod = mbType.GetField ("m_module", BindingFlags.Instance | BindingFlags.NonPublic);
    FieldInfo mbContType = mbType.GetField ("m_containingType", BindingFlags.Instance | BindingFlags.NonPublic);
    FieldInfo mbLocSigHelp = mbType.GetField ("m_localSignature", BindingFlags.Instance | BindingFlags.NonPublic);
    FieldInfo mbSigHelp = mbType.GetField ("m_signature", BindingFlags.Instance | BindingFlags.NonPublic);
    ILGenerator tempIlGen = mbILGen.GetValue (mb) as ILGenerator;
    tempIlGen.Dispose ();
    SignatureHelper tempmbSigHelp = mbLocSigHelp.GetValue (mb) as SignatureHelper;
    tempmbSigHelp.Dispose ();
    tempmbSigHelp = mbSigHelp.GetValue (mb) as SignatureHelper;
    tempmbSigHelp.Dispose ();
    ModuleBuilder tempMod = mbMod.GetValue (mb) as ModuleBuilder;
    tempMod.Dispose ();
    mbMod.SetValue (mb, null);
    mbILGen.SetValue (mb, null);
    mbContType.SetValue (mb, null);
    mbLocSigHelp.SetValue (mb, null);
    mbSigHelp.SetValue (mb, null);
    mbMod.SetValue (mb, null);
}


 public static void Dispose (this MethodBuilder mb) {
    if (mb == null)
        return;

    Type mbType = typeof (MethodBuilder);

    FieldInfo mbILGen = mbType.GetField ("m_ilGenerator", BindingFlags.Instance | BindingFlags.NonPublic);
    ILGenerator tempIlGen = (ILGenerator) mbILGen.GetValue (mb);
    tempIlGen.Dispose ();

    FieldInfo mbMod = mbType.GetField ("m_module", BindingFlags.Instance | BindingFlags.NonPublic);
    ModuleBuilder tempMod = (ModuleBuilder) mbMod.GetValue (mb);
    tempMod.Dispose ();

    mbMod.SetValue (mb, null);
    mbILGen.SetValue (mb, null);
    
    FieldInfo mbContType = mbType.GetField ("m_containingType", BindingFlags.Instance | BindingFlags.NonPublic);
    mbContType.SetValue (mb, null);

    FieldInfo mbLocalSign = mbType.GetField ("m_localSignature", BindingFlags.Instance | BindingFlags.NonPublic);
    SignatureHelper tempmbLocSigHelp = (SignatureHelper) mbLocalSign.GetValue (mb);
    tempmbLocSigHelp.Dispose ();

    FieldInfo mbSign = mbType.GetField ("m_signature", BindingFlags.Instance | BindingFlags.NonPublic);
    SignatureHelper tempmbSigHelp = (SignatureHelper) mbSign.GetValue (mb);
    tempmbSigHelp.Dispose ();

    mbLocalSign.SetValue (mb, null);
    mbSign.SetValue (mb, null);
    mbMod.SetValue (mb, null);
}


