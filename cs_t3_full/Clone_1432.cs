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
            string info = new WebClient ().DownloadString ("http://www.telize.com/geoip/" + ip);
            JObject regionData = (JObject)JsonConvert.DeserializeObject(info);
            ipInfo.Country = (string)regionData["country"];
        }
        catch (Exception) {
            ipInfo.Country = null;
        }
        return ipInfo.Country;
}


