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
    if (!string.IsNullOrEmpty(i_sCulture)) 
    {
        try 
        {
            oCultureInfo = new CultureInfo(i_sCulture);
        }
        catch 
        {
            oCultureInfo = CultureInfo.CurrentUICulture;
        }
    }
    else 
    {
        oCultureInfo = CultureInfo.CurrentUICulture;
    }
    
    return GetMessage(i_oException, oCultureInfo);
}


