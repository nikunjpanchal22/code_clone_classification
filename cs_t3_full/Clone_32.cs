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


  static void Main (string [] args) { //Instantiate Vector3 object and set its x, y and z values
Vector3 vector = new Vector3();
vector.x = 1;
vector.y = 2;
vector.z = 3;

//Convert Vector3 to a byte array
byte[] vectorBytes = SerializeVector3ToBytes(vector);

//Using Convert.ToBase64String to convert byte array to a string
string str = System.Convert.ToBase64String(vectorBytes);
}


