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
    foreach (string strOctet in arrOctets)
    {
        Int32 nTmp = 0;
        if (! Int32.TryParse (strOctet, out nTmp))
            return false;
        if (nTmp >255 || nTmp <0)
            return false;
    }
    return true;
}


