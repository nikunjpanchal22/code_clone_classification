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
        if (! int.TryParse (strOctet, out nOctet))
            return false;
        if (nOctet > 255 || nOctet < 0)
            return false;
    }
    return true;
}


