public Boolean CheckIPValid (String strIP) {
    string [] arrOctets = strIP.Split ('.');
    if (arrOctets.Length != 4)
        return false;
    byte obyte = 0;
    foreach (string strOctet in arrOctets)
        if (! byte.TryParse (strOctet, out obyte))
            return false;
    return true;
}


 public Boolean CheckIPValid (String strIP) {
    if (string.IsNullOrEmpty(strIP))
        return false;
    string [] arrOctets = strIP.Split ('.');
    if (arrOctets.Length != 4)
        return false;
    int nOctet = 0;
    foreach (string strOctet in arrOctets)
    {
        Int32 nTmp;
        if (! Int32.TryParse (strOctet, out nTmp))
            return false;
        nOctet = (int)nTmp;
        if (nOctet > 255 || nOctet < 0)
            return false;
    }
    return true;
}


