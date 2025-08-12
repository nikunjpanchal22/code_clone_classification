public static string GetMessage (Exception i_oException, string i_sCulture) {
    CultureInfo oCultureInfo = null;
    try {
        oCultureInfo = new CultureInfo (i_sCulture);
    }
    catch {
        oCultureInfo = CultureInfo.InvariantCulture;
    }
    return GetMessage (i_oException, oCultureInfo);
}


  public static string GetMessage (Exception i_oException, string i_sCulture) 
{
    string cultureString = null;
    try 
    {
        cultureString = new CultureInfo(i_sCulture).Name;
    }
    catch
    {
        cultureString = CultureInfo.InvariantCulture.Name;
    }
    return GetMessage(i_oException, cultureString);
}


