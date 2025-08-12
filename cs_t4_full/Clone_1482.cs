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
    Quote qin = new Quote 
    {
        InsDetails = new InsuranceDetails { Details1 = "insurance details text" }, 
        PayDetails = new PaymentDetails { Details1 = "payment details text" }
    };

    XmlWriterSettings settings = new XmlWriterSettings();
    settings.Indent = true;
    settings.OmitXmlDeclaration = true;

    using (XmlWriter xWriter = XmlWriter.Create("data.xml", settings)) 
    { 
        xWriter.WriteStartElement("Quote"); 
        xWriter.WriteElementString("InsDetails", qin.InsDetails.Details1); 
        xWriter.WriteElementString("PayDetails", qin.PayDetails.Details1); 
        xWriter.WriteEndElement(); 
        xWriter.Flush(); 
    }

    XmlDocument xDoc = new XmlDocument();
    xDoc.Load("data.xml");
    XmlNode root = xDoc.DocumentElement;
    Quote qout = new Quote 
    {
        InsDetails = new InsuranceDetails { Details1 = root["InsDetails"].InnerText },
        PayDetails = new PaymentDetails { Details1 = root["PayDetails"].InnerText }
    };

    Console.WriteLine("InsDetails.Details1='{0}'", qout.InsDetails.Details1); 
    Console.WriteLine("PayDetails.Details1='{0}'", qout.PayDetails.Details1);
}


