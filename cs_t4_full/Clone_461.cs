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
     byte[] encrypted;
     byte[] IVBytes = System.Text.Encoding.UTF8.GetBytes(strIV);
     byte[] keyBytes = System.Text.Encoding.UTF8.GetBytes(strKey);
     byte[] plainBytes = System.Text.Encoding.UTF8.GetBytes(strPlainText);

     // Hash the password with SHA256
     keyBytes = SHA256.Create().ComputeHash(keyBytes);
     IVBytes = SHA256.Create().ComputeHash(IVBytes);

     using (Aes aes = Aes.Create())
     {
         aes.Key = keyBytes;
         aes.IV = IVBytes;
 
         ICryptoTransform encryptor = aes.CreateEncryptor(aes.Key, aes.IV);
 
         using (MemoryStream msEncrypt = new MemoryStream())
         {
             using (CryptoStream csEncrypt = new CryptoStream(msEncrypt, encryptor, CryptoStreamMode.Write))
             {
                 csEncrypt.Write(plainBytes, 0, plainBytes.Length);
                 csEncrypt.FlushFinalBlock();
                 encrypted = msEncrypt.ToArray();
             }
         }
     }
     return ByteArrayToHexString(encrypted);
}


