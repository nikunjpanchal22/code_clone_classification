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

    MemoryStream ms = new MemoryStream();
    StreamingContext context = new StreamingContext(StreamingContextStates.All);
    XmlSerializerNamespaces ns = new XmlSerializerNamespaces(new XmlQualifiedName[] { XmlQualifiedName.Empty });   
    XmlSerializer serializer = new XmlSerializer(typeof(Quote));
    serializer.Serialize(ms, qin, context, ns); 
    ms.Position = 0;
    byte[] byteData = new byte[ms.Length];
    ms.Read(byteData, 0, byteData.Length);
    string xml = Encoding.UTF8.GetString(byteData);
    
    TextReader reader = new StringReader(xml); 
    Quote qout = (Quote)serializer.Deserialize(reader);

    Console.WriteLine("InsDetails.Details1='{0}'", qout.InsDetails.Details1); 
    Console.WriteLine("PayDetails.Details1='{0}'", qout.PayDetails.Details1);
}


