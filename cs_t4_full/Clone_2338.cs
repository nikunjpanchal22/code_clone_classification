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
    return "{0},{1},{2}\r\n".Replace("{0}", mIPAD.pin.KSN).Replace("{1}", mIPAD.pin.EPB).Replace("{2}", mIPAD.getStatusCode());
    Thread.Sleep (20000);
}


