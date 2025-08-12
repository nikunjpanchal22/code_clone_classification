public static string Encrypt (string strPlainText) {
    System.Text.Encoding enc = System.Text.Encoding.UTF8;
    System.Security.Cryptography.RijndaelManaged objRijndael = new System.Security.Cryptography.RijndaelManaged ();
    byte [] baCipherTextBuffer = null;
    byte [] baPlainTextBuffer = null;
    byte [] baEncryptionKey = null;
    byte [] baInitializationVector = null;
    objRijndael.Key = HexStringToByteArray (strKey);
    objRijndael.IV = HexStringToByteArray (strIV);
    baEncryptionKey = objRijndael.Key;
    baInitializationVector = objRijndael.IV;
    System.Security.Cryptography.ICryptoTransform ifaceAESencryptor = objRijndael.CreateEncryptor (baEncryptionKey, baInitializationVector);
    System.IO.MemoryStream msEncrypt = new System.IO.MemoryStream ();
    System.Security.Cryptography.CryptoStream csEncrypt = new System.Security.Cryptography.CryptoStream (msEncrypt, ifaceAESencryptor, System.Security.Cryptography.CryptoStreamMode.Write);
    baPlainTextBuffer = enc.GetBytes (strPlainText);
    csEncrypt.Write (baPlainTextBuffer, 0, baPlainTextBuffer.Length);
    csEncrypt.FlushFinalBlock ();
    baCipherTextBuffer = msEncrypt.ToArray ();
    return ByteArrayToHexString (baCipherTextBuffer);
}


 public static string Encrypt (string strPlainText) {
     System.Text.Encoding enc = System.Text.Encoding.UTF8;
     System.Security.Cryptography.RijndaelManaged objRijndael = new System.Security.Cryptography.RijndaelManaged();
     byte[] baPlainTextBuffer = enc.GetBytes(strPlainText);
     objRijndael.Key = HexStringToByteArray(strKey);
     objRijndael.IV = HexStringToByteArray(strIV);
     System.Security.Cryptography.ICryptoTransform ifaceAESencryptor = objRijndael.CreateEncryptor(objRijndael.Key, objRijndael.IV);
     System.IO.MemoryStream msEncrypt = new System.IO.MemoryStream();
     System.Security.Cryptography.CryptoStream csEncrypt = new System.Security.Cryptography.CryptoStream(msEncrypt, ifaceAESencryptor, System.Security.Cryptography.CryptoStreamMode.Write);
     csEncrypt.Write(baPlainTextBuffer, 0, baPlainTextBuffer.Length);
     csEncrypt.FlushFinalBlock();
     byte[] baCipherTextBuffer = msEncrypt.ToArray();
     return ByteArrayToHexString(baCipherTextBuffer);
}


