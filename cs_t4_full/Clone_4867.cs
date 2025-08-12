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
    var qin = new Quote { InsDetails = new InsuranceDetails { Details1 = "insurance details text" }, PayDetails = new PaymentDetails { Details1 = "payment details text" }, };

    XmlSerializer serializer = new XmlSerializer(typeof(Quote));
    using (StringWriter sw = new StringWriter())
    {
        serializer.Serialize(sw, qin);
        using (XmlTextReader xmlReader = new XmlTextReader(new StringReader(sw.ToString())))
        {
            Quote qout = (Quote)serializer.Deserialize(xmlReader);

            Console.WriteLine("InsDetails.Details1='{0}'", qout.InsDetails.Details1);
            Console.WriteLine("PayDetails.Details1='{0}'", qout.PayDetails.Details1);
        }
    }
}


