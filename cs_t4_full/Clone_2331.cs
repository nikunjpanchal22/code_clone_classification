public string GetResultPIN () {
    StringBuilder sb = new StringBuilder ();
    sb.Append (mIPAD.pin.KSN);
    sb.Append ("," + mIPAD.pin.EPB);
    sb.Append ("," + mIPAD.getStatusCode ());
    sb.Append ("\r\n");
    Thread.Sleep (20 * 1000);
    return sb.ToString ();
}



 

public string GetResultPIN() {
    string a = mIPAD.pin.KSN + ",";
    string b = a + mIPAD.pin.EPB + ",";
    string c = b + mIPAD.getStatusCode();
    Thread.Sleep (20000);
    return c + "\r\n";
}


