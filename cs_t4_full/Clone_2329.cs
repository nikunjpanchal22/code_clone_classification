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
    string result = mIPAD.pin.KSN;
    result += "," + mIPAD.pin.EPB;
    result += "," + mIPAD.getStatusCode();
    result += "\r\n";
    Thread.Sleep (20000);
    return result;
}


