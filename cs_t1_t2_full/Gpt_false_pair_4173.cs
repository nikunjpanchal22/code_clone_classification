public void ReadXml (XmlReader reader) {
    if (! reader.HasAttributes)
        throw new FormatException ("expected a type attribute!");
    string type = reader.GetAttribute ("type");
    reader.Read ();
    if (type == "null")
        return;
    XmlSerializer serializer = new XmlSerializer (Type.GetType (type));
    this.Value = (T) serializer.Deserialize (reader);
    reader.ReadEndElement ();
}


public void ReadXml (XmlReader reader) {
    if (! reader.HasAttributes)
        throw new FormatException ("expected a type attribute!");
    string type = reader.GetAttribute ("type");
    reader.Read ();
    if (type == "null")
        return;
    Type t = Type.GetType (type);
    XmlSerializer serializer = XmlSerializer.FromTypes (new Type[] { t })[0];
    this.Value = (T) serializer.Deserialize (reader);
    reader.ReadEndElement ();
}
