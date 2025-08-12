public static string DeCrypt (string strEncryptedInput) {
    string strReturnValue = null;
    if (string.IsNullOrEmpty (strEncryptedInput)) {
        throw new ArgumentNullException ("strEncryptedInput", "strEncryptedInput may not be string.Empty or NULL, because these are invid values.");
    }
    System.Text.Encoding enc = System.Text.Encoding.UTF8;
    System.Security.Cryptography.RijndaelManaged objRijndael = new System.Security.Cryptography.RijndaelManaged ();
    byte [] baCipherTextBuffer = HexStringToByteArray (strEncryptedInput);
    byte [] baDecryptionKey = HexStringToByteArray (strKey);
    byte [] baInitializationVector = HexStringToByteArray (strIV);
    System.Security.Cryptography.ICryptoTransform ifaceAESdecryptor = objRijndael.CreateDecryptor (baDecryptionKey, baInitializationVector);
    System.IO.MemoryStream msDecrypt = new System.IO.MemoryStream (baCipherTextBuffer);
    System.Security.Cryptography.CryptoStream csDecrypt = new System.Security.Cryptography.CryptoStream (msDecrypt, ifaceAESdecryptor, System.Security.Cryptography.CryptoStreamMode.Read);
    byte [] baPlainTextBuffer = new byte [baCipherTextBuffer.Length + 1];
    csDecrypt.Read (baPlainTextBuffer, 0, baPlainTextBuffer.Length);
    strReturnValue = enc.GetString (baPlainTextBuffer);
    if (! string.IsNullOrEmpty (strReturnValue))
        strReturnValue = strReturnValue.Trim ('\0');
    return strReturnValue;
}


 public static string DeCrypt(string strEncryptedInput) {
    if (string.IsNullOrEmpty(strEncryptedInput))
        throw new ArgumentNullException("strEncryptedInput", "strEncryptedInput may not be string.Empty or NULL, because these are invid values.");

    System.Security.Cryptography.AesCryptoServiceProvider aes = new System.Security.Cryptography.AesCryptoServiceProvider();

    System.Text.Encoding enc = System.Text.Encoding.UTF8;
    byte [] baDecryptionKey = HexStringToByteArray (strKey);
    byte [] baInitializationVector = HexStringToByteArray (strIV);

    aes.Key = baDecryptionKey;
    aes.IV = baInitializationVector;
    aes.Mode = System.Security.Cryptography.CipherMode.CBC;

    byte[] encryptedMessage = HexStringToByteArray(strEncryptedInput);

    byte[] decryptedByte = new byte[encryptedMessage.Length];

    System.Security.Cryptography.ICryptoTransform icrypt = aes.CreateDecryptor(aes.Key, aes.IV);

    System.IO.MemoryStream mstream = new System.IO.MemoryStream(encryptedMessage);

    using(System.Security.Cryptography.CryptoStream csDecrypt = new System.Security.Cryptography.CryptoStream(mstream, icrypt, System.Security.Cryptography.CryptoStreamMode.Read)) {
        csDecrypt.Read(decryptedByte, 0, decryptedByte.Length);
     }
 
    return enc.GetString(decryptedByte);
}


