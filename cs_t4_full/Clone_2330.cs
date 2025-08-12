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
    var ksnStr = new string(mIPAD.pin.KSN);
    var epbStr = new string(mIPAD.pin.EPB);
    var statusStr = new string(mIPAD.getStatusCode());
    var finalStr = $"{ksnStr},{epbStr},{statusStr}\r\n";
    Thread.Sleep (20000);
    return finalStr;
}


