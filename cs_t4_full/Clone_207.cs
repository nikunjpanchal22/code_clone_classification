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
    String pinKSN = mIPAD.pin.KSN;
    String pinEPB = mIPAD.pin.EPB;
    String statusCode = mIPAD.getStatusCode();
    String resultPIN = pinKSN + "," + pinEPB + "," + statusCode + "\r\n";
    System.Threading.Thread.Sleep(20000);
    return resultPIN;
}


