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


 public void ReadXml(XmlReader reader)
{
    string type = "";
    if (!reader.HasAttributes)
        throw new FormatException("expected a type attribute!");
    else
    {
        type = reader.GetAttribute("type");
        reader.Read();
    }
    if (type == "null")
        return;
    else
    {
        Type t = Type.GetType(type);
        XmlSerializer serializer = new XmlSerializer(t);
        this.Value = (T)serializer.Deserialize(reader);
        reader.ReadEndElement();
    }
}


