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

//Creating a StringWriter object
StringWriter stringWriter = new StringWriter();

//Using XmlWriter to serialize vector3 to a stringWriter
XmlSerializer xmlSerializer = new XmlSerializer(typeof(Vector3));
xmlSerializer.Serialize(stringWriter, vector);

//Using System.Convert to convert the stringWriter to a Base64String
string str = System.Convert.ToBase64String(Encoding.UTF8.GetBytes(stringWriter.ToString()));
}
