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
    string [] arrOctets = strIP.Split ('.');
    if (arrOctets.Length != 4)
        return false;
    sbyte octet;
    foreach (string strOctet in arrOctets) {
        if (!sbyte.TryParse(strOctet, out octet) || octet < 0 || octet > 255)
            return false;
    }
    return true;
}


