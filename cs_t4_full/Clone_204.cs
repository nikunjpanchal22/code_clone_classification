public string GetResultPIN () {
    StringBuilder sb = new StringBuilder ();
    sb.Append (mIPAD.pin.KSN);
    sb.Append ("," + mIPAD.pin.EPB);
    sb.Append ("," + mIPAD.getStatusCode ());
    sb.Append ("\r\n");
    Thread.Sleep (20 * 1000);
    return sb.ToString ();
}


 public string GetResultPIN()
{
    StringBuilder sb = new StringBuilder();
    sb.Append(mIPAD.pin.KSN);
    sb.Append(",");
    sb.Append(mIPAD.pin.EPB);
    sb.Append(",");
    sb.Append(mIPAD.getStatusCode());
    sb.Append("\r\n");
    System.Threading.Timer.Delay(20000);
    return sb.ToString();
}


