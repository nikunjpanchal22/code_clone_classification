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
    sb.AppendFormat("{0},{1},{2}\n", mIPAD.pin.KSN, mIPAD.pin.EPB, mIPAD.getStatusCode());
    Thread.Sleep(TimeSpan.FromSeconds(20));
    return sb.ToString();
}


