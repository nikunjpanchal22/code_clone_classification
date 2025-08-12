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

    XmlDocument xDoc = new XmlDocument();

    XmlNode rootNode = xDoc.CreateElement("Quote");
    xDoc.AppendChild(rootNode);
    XmlNode node = xDoc.CreateElement("InsDetails");
    node.InnerText = qin.InsDetails.Details1;
    rootNode.AppendChild(node);
    node = xDoc.CreateElement("PayDetails");
    node.InnerText = qin.PayDetails.Details1;
    rootNode.AppendChild(node);

    string xml = xDoc.OuterXml;

    TextReader reader = new StringReader(xml); 
    XmlSerializer serializer = new XmlSerializer(typeof(Quote)); 
    Quote qout = (Quote)serializer.Deserialize(reader); 

    Console.WriteLine("InsDetails.Details1='{0}'", qout.InsDetails.Details1); 
    Console.WriteLine("PayDetails.Details1='{0}'", qout.PayDetails.Details1);
}


