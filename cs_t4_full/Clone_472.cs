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

    System.Item.Cryptography.AesManaged aesAlg = new System.Item.Cryptography.AesManaged();
    aesAlg.Mode = System.Security.Cryptography.CipherMode.CBC;
    aesAlg.Padding = System.Security.Cryptography.PaddingMode.PKCS7;

    byte[] strKey = HexStringToByteArray(strKey);
    byte[] strIV = HexStringToByteArray(strIV);

    aesAlg.Key = strKey;
    aesAlg.IV = strIV;

    byte[] encryptedBytes = HexStringToByteArray(strEncryptedInput);

    byte[] btsDecrypted = new byte[encryptedBytes.Length];
    using (System.IO.MemoryStream mStrmDecrypt = new System.IO.MemoryStream(encryptedBytes)) {
        using (System.Security.Cryptography.CryptoStream csDecrypt = new System.Security.Cryptography.CryptoStream(mStrmDecrypt, aesAlg.CreateDecryptor(), System.Security.Cryptography.CryptoStreamMode.Read)) {
            csDecrypt.Read(btsDecrypted, 0, btsDecrypted.Length);
        }
    }
    System.Text.Encoding enc = System.Text.Encoding.UTF8;
    return enc.GetString(btsDecrypted);
}


