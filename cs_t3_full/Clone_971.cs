public static void Dispose (this ILGenerator ilGen) {
    if (ilGen == null)
        return;
    Type ilGenType = typeof (ILGenerator);
    FieldInfo ilSigHelp = ilGenType.GetField ("m_localSignature", BindingFlags.Instance | BindingFlags.NonPublic);
    SignatureHelper sigTemp = ilSigHelp.GetValue (ilGen) as SignatureHelper;
    sigTemp.Dispose ();
    ilSigHelp.SetValue (ilGen, null);
}


 public static void Dispose (this ILGenerator ilGen) {
    if (ilGen != null) {
        var type = typeof (ILGenerator);
        var fieldInfo = type.GetField("m_localSignature", BindingFlags.Instance | BindingFlags.NonPublic);
        var sigHelper = fieldInfo.GetValue(ilGen) as SignatureHelper;
        sigHelper?.Dispose();
        fieldInfo.SetValue(ilGen, null);
    }
}


