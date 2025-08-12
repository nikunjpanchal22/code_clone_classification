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
            string info = new WebClient ().DownloadString ("http://api.ipinfodb.com/v3/ip-country/?key=788f16da979b8fcd6e73d6ba205dd472&ip=" + ip);
            JObject regionData = (JObject)JsonConvert.DeserializeObject(info);
            ipInfo.Country = (string)regionData["countryName"];
        }
        catch (Exception) {
            ipInfo.Country = null;
        }
        return ipInfo.Country;
}


