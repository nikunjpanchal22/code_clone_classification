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


public Boolean HasValidIP (String strIP) {
    string [] arrDivided = strIP.Split ('.');
    if (arrDivided.Length != 4)
        return false;
    byte obyte = 0;
    foreach (string strDivided in arrDivided)
        if (! byte.TryParse (strDivided, out obyte))
            return false;
    return true;
}
