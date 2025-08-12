static void Main (string [] args) {
    Vector3 vector = new Vector3 ();
    vector.x = 1;
    vector.y = 2;
    vector.z = 3;
    MemoryStream memoryStream = new MemoryStream ();
    BinaryFormatter binaryFormatter = new BinaryFormatter ();
    binaryFormatter.Serialize (memoryStream, vector);
    string str = System.Convert.ToBase64String (memoryStream.ToArray ());
}


 static void Main (string [] args) {//Creating an vector3 object and setting its x, y, and z values
Vector3 vector = new Vector3();
vector.x = 1;
vector.y = 2;
vector.z = 3;

//Creating a XmlWriter object
XmlWriter xmlWriter = XmlWriter.Create(new MemoryStream());

//Using XmlWriter to serialize vector to a MemoryStream
XmlSerializer xmlSerializer = new XmlSerializer(typeof(Vector3));
xmlSerializer.Serialize(xmlWriter, vector);

//Using System.Convert toBase64String to convert memorystream to a string
string str = System.Convert.ToBase64String(((MemoryStream)xmlWriter.BaseStream).ToArray());
}


