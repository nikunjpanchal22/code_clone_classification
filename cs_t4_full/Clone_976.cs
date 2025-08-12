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
        SignatureHelper sigHelp = ilGen.GetType()
            .GetField("m_localSignature", BindingFlags.Instance | BindingFlags.NonPublic)
            .GetValue(ilGen) as SignatureHelper;

        sigHelp?.Dispose();
        ilGen.GetType().GetField("m_localSignature", BindingFlags.Instance | BindingFlags.NonPublic).SetValue(ilGen, null);
    }
}


