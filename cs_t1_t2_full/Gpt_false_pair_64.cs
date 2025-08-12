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


 static void Main (string [] args) {
Vector3 vector = new Vector3();
vector.x = 1;
vector.y = 2;
vector.z = 3;

//Creating a MemoryStream object and BinaryFormatter
MemoryStream memoryStream = new MemoryStream();
BinaryFormatter binaryFormatter = new BinaryFormatter();

//Serialize Vector3 and write it to memorystream
binaryFormatter.Serialize(memoryStream, vector);

//Converting MemoryStream to bytes and using System.Convert toBase64String
string str = System.Convert.ToBase64String(memoryStream.ToArray());
}
