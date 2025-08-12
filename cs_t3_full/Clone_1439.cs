public static string GetUserCountryByIp (string ip) {
    IpInfo ipInfo = new IpInfo ();
    try {
        string info = new WebClient ().DownloadString ("http://ipinfo.io/" + ip);
        ipInfo = JsonConvert.DeserializeObject < IpInfo > (info);
        RegionInfo myRI1 = new RegionInfo (ipInfo.Country);
        ipInfo.Country = myRI1.EnglishName;
    }
    catch (Exception) {
        ipInfo.Country = null;
    }
    return ipInfo.Country;
}


 public static string GetUserCountryByIp (string ip) {
        IpInfo ipInfo = new IpInfo ();
        try {
            string info = new WebClient ().DownloadString ("http://api.ipstack.com/" + ip + "?access_key=ab8f6322bfbb4d4ce1f41934c9ad9e76");
            JObject regionData = (JObject)JsonConvert.DeserializeObject(info);
            ipInfo.Country = (string)regionData["country_name"];
        }
        catch (Exception) {
            ipInfo.Country = null;
        }
        return ipInfo.Country;
}


