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
        sb.Append($"{ mIPAD.pin.KSN }, { mIPAD.pin.EPB }, { mIPAD.getStatusCode() }\r\n");

        Thread.Sleep(TimeSpan.FromSeconds(20));
    }
    catch (Exception ex)
    {
        Messagebox.Show(ex.Message);
    }

    return sb.ToString();
}


