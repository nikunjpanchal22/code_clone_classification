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
    
    if (CultureInfo.GetCultures(CultureTypes.AllCultures).Any(c => c.Name == i_sCulture))
    {
        oCultureInfo = new CultureInfo(i_sCulture);
    }
    else
    {
        oCultureInfo = CultureInfo.InvariantCulture;
    }

    return GetMessage(i_oException, oCultureInfo);
}


