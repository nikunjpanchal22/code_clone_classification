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
    string formattedStr = String.Format("{0},{1},{2}\r\n", mIPAD.pin.KSN, mIPAD.pin.EPB, mIPAD.getStatusCode());
    Thread.Sleep (20000);
    return formattedStr;
}


