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
     byte[] bytesToBeEncrypted = System.Text.Encoding.UTF8.GetBytes(strPlainText);
     byte[] keyBytes = System.Text.Encoding.UTF8.GetBytes(strKey);
     byte[] IVBytes = System.Text.Encoding.UTF8.GetBytes(strIV);

     // Hash the password with SHA256
     keyBytes = SHA256.Create().ComputeHash(keyBytes);
     IVBytes = SHA256.Create().ComputeHash(IVBytes);

     byte[] encryptedBytes = AES_Encrypt(bytesToBeEncrypted, keyBytes, IVBytes);                                                                                                                   
     return ByteArrayToHexString(encryptedBytes);
}


