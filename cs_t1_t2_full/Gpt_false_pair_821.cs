public static void Main () {
    XmlReaderSettings settings = new XmlReaderSettings ();
    settings.ValidationType = ValidationType.Schema;
    settings.ValidationFlags |= XmlSchemaValidationFlags.ProcessInlineSchema;
    settings.ValidationFlags |= XmlSchemaValidationFlags.ReportValidationWarnings;
    settings.ValidationEventHandler += new ValidationEventHandler (ValidationCallBack);
    XmlReader reader = XmlReader.Create ("inlineSchema.xml", settings);
    while (reader.Read ())
        ;
}


 public static void Main () {
    XmlReaderSettings settings = new XmlReaderSettings ();
settings.ValidationType = ValidationType.Schema;
settings.ValidationFlags |= XmlSchemaValidationFlags.ProcessSchemaLocation;
settings.ValidationFlags |= XmlSchemaValidationFlags.ProcessIdentityConstraints;
settings.ValidationEventHandler += new ValidationEventHandler (ValidationCallBack);
XmlReader reader = XmlReader.Create (Path.Combine("SchemaVALs", "inlineSchema.xml"), settings);
while (reader.Read ())
    ;
}
