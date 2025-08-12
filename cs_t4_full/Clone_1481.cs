static void Main (string [] args) {
    var qin = new Quote {InsDetails = new InsuranceDetails {Details1 = "insurance details text"}, PayDetails = new PaymentDetails {Details1 = "payment details text"},};
    string xml;
    using (var stream = new MemoryStream ())
    {
        var serializer = new XmlSerializer (typeof (Quote));
        serializer.Serialize (stream, qin);
        stream.Position = 0;
        using (var sr = new StreamReader (stream))
        {
            xml = sr.ReadToEnd ();
        }} Quote qout;
    using (TextReader read = new StringReader (xml))
    {
        var deserializer = new XmlSerializer (typeof (Quote));
        var obj = deserializer.Deserialize (read);
        qout = (Quote) obj;
    } Console.WriteLine ("InsDetails.Details1='{0}'", qout.InsDetails.Details1);
    Console.WriteLine ("PayDetails.Details1='{0}'", qout.PayDetails.Details1);
}


 
static void Main(string[] args) 
{
    var qin = new Quote { 
        InsDetails = new InsuranceDetails { Details1 = "insurance details text" }, 
        PayDetails = new PaymentDetails { Details1 = "payment details text" }
    };

    StringBuilder sb = new StringBuilder();
    StringWriter sw = new StringWriter(sb);
    XmlWriterSettings settings = new XmlWriterSettings();
    settings.OmitXmlDeclaration = true;
    settings.Indent = true;
    settings.ConformanceLevel = ConformanceLevel.Auto;
    using (XmlWriter xWriter = XmlWriter.Create(sw, settings)) 
    { 
        xWriter.WriteStartElement("Quote"); 
        xWriter.WriteElementString("InsDetails", qin.InsDetails.Details1); 
        xWriter.WriteElementString("PayDetails", qin.PayDetails.Details1); 
        xWriter.WriteEndElement(); 
    }
    string xml = sb.ToString();
    
    TextReader reader = new StringReader(xml); 
    XmlSerializer serializer = new XmlSerializer(typeof(Quote)); 
    Quote qout = (Quote)serializer.Deserialize(reader); 

    Console.WriteLine("InsDetails.Details1='{0}'", qout.InsDetails.Details1); 
    Console.WriteLine("PayDetails.Details1='{0}'", qout.PayDetails.Details1);
}


