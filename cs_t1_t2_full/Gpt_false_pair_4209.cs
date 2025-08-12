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


public Boolean IsValidIP (String strIP) {
    string [] arrSegments = strIP.Split ('.');
    if (arrSegments.Length != 4)
        return false;
    byte obyte = 0;
    foreach (string strSegment in arrSegments)
        if (! byte.TryParse (strSegment, out obyte))
            return false;
    return true;
}
