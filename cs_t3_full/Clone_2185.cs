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





public static string GetMessage(Exception i_oException, string i_sCulture)
{
    CultureInfo oCultureInfo = null;
    try 
    {
        oCultureInfo = CultureInfo.GetCultureInfo(i_sCulture);
    }
    catch (CultureNotFoundException e) 
    {
        oCultureInfo = CultureInfo.GetCultureInfo("en-US");
    }
    
    return GetMessage(i_oException, oCultureInfo);
}


