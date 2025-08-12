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
    CultureInfo cultureInfoObj = null;
    try {
        cultureInfoObj = new CultureInfo(i_sCulture);
    }
    catch {
        cultureInfoObj =  CultureInfo.GetCultureInfoByIetfLanguageTag(i_sCulture);
    }
    return GetMessage(i_oException, cultureInfoObj);
}
