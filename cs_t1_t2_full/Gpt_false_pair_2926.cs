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


void SignXml (XmlDocument xmlDoc, RSA Key) {
    SignedXml signedXml = new SignedXml (xmlDoc);
    signedXml.SigningKey = Key;
    Reference reference = new Reference ("");
    XmlDsigExcC14NTransform c14Transform = new XmlDsigExcC14NTransform();
    reference.AddTransform(c14Transform);
    signedXml.AddReference (reference);
    signedXml.ComputeSignature ();
    XmlElement xmlSignature = signedXml.GetXml ();
    AssignNameSpacePrefixToElementTree (xmlSignature, "ds");
    xmlDoc.DocumentElement.AppendChild (xmlDoc.ImportNode (xmlSignature, true));
}
