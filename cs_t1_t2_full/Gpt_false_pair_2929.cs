void SignXml (XmlDocument xmlDoc, RSA Key) {
    SignedXml signedXml = new SignedXml (xmlDoc);
    signedXml.SigningKey = Key;
    Reference reference = new Reference ("");
    reference.AddTransform (new XmlDsigEnvelopedSignatureTransform ());
    signedXml.AddReference (reference);
    signedXml.ComputeSignature ();
    XmlElement xmlSignature = signedXml.GetXml ();
    AssignNameSpacePrefixToElementTree (xmlSignature, "ds");
    xmlDoc.DocumentElement.AppendChild (xmlDoc.ImportNode (xmlSignature, true));
}


void SignXml (XmlDocument xmlDoc, CryptoKey Key) {
    SignedXml signedXml = new SignedXml (xmlDoc);
    signedXml.SigningKey = Key;
    Reference reference = new Reference ("");
    reference.AddTransform (new XmlDsigEnvelopedSignatureTransform ());
    signedXml.AddReference (reference);
    signedXml.ComputeSignature ();
    XmlElement xmlSignature = signedXml.GetXml ();
    AssignNameSpacePrefixToElementTree (xmlSignature, "ds");
    xmlDoc.DocumentElement.AppendChild (xmlDoc.ImportNode (xmlSignature, true));
}
