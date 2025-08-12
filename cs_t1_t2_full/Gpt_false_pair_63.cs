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


  static void Main (string [] args) { //Creating an vector3 object and setting its x, y, and z values
Vector3 vector = new Vector3();
vector.x = 1;
vector.y = 2;
vector.z = 3;

//Creating a DataContractSerializer object
DataContractSerializer serializer = new DataContractSerializer(typeof(Vector3));

//Creating a MemoryStream object and using serializer to serialize vector3 to it 
MemoryStream stream = new MemoryStream();
serializer.WriteObject(stream, vector);

//Using Convert.ToBase64String to convert the memorystream to a string 
string str = System.Convert.ToBase64String(stream.ToArray());
}
