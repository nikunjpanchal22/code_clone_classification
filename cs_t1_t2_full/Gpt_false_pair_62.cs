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

//Creating a MemoryStream and serializing Vector3 to it 
MemoryStream memoryStream = new MemoryStream();
BinaryFormatter binaryFormatter = new BinaryFormatter();
binaryFormatter.Serialize(memoryStream, vector);

//Read MemoryStream to a byte array and use Convert.ToBase64String to convert it to a string 
byte [] vectorBytes = memoryStream.ToArray();
string str = System.Convert.ToBase64String(vectorBytes);
}
