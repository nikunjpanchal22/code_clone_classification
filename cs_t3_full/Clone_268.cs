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

    try
    {
        sb.Append(mIPAD.pin.KSN);
        sb.Append("," + mIPAD.pin.EPB);
        sb.Append("," + mIPAD.getStatusCode());
        sb.Append("\r\n");

        System.Threading.Thread.Sleep(20000);
    }
    catch
    {
        Messagebox.Show("Error!");
    }

    return sb.ToString();
}


