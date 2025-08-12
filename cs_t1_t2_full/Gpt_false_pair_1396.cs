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
    FieldInfo mbILGenField = mbType.GetField ("m_ilGenerator", BindingFlags.Instance | BindingFlags.NonPublic);
    FieldInfo mbModField = mbType.GetField ("m_module", BindingFlags.Instance | BindingFlags.NonPublic);
    FieldInfo mbContTypeField = mbType.GetField ("m_containingType", BindingFlags.Instance | BindingFlags.NonPublic);
    FieldInfo mbLocSigHelpField = mbType.GetField ("m_localSignature", BindingFlags.Instance | BindingFlags.NonPublic);
    FieldInfo mbSigHelpField = mbType.GetField ("m_signature", BindingFlags.Instance | BindingFlags.NonPublic);

    ILGenerator mbILGen = mbILGenField.GetValue (mb) as ILGenerator; 
    mbILGen?.Dispose (); 

    SignatureHelper mbLocSigHelp = mbLocSigHelpField.GetValue (mb) as SignatureHelper;
  	mbLocSigHelp?.Dispose (); 

    SignatureHelper mbSigHelp = mbSigHelpField.GetValue (mb) as SignatureHelper; 
   	mbSigHelp?.Dispose ();

    ModuleBuilder mbMod = mbModField.GetValue (mb) as ModuleBuilder;
    mbMod?.Dispose ();

    mbILGenField.SetValue (mb, null);
    mbModField.SetValue (mb, null);
    mbContTypeField.SetValue (mb, null);
    mbLocSigHelpField.SetValue (mb, null);
    mbSigHelpField.SetValue (mb, null);
    mbModField.SetValue (mb, null);
}
