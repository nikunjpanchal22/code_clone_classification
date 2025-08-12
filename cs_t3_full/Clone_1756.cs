public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    JObject obj = JObject.Load (reader);
    LinksResult result = new LinksResult ();
    result.Count = (int) obj ["count"];
    result.ErrorCode = (int) obj ["errorCode"];
    result.ErrorMessage = (string) obj ["errorMessage"];
    result.Links = new List < LinkData > ();
    for (int i = 1; i <= result.Count; i ++) {
        string index = i.ToString ();
        LinkData link = new LinkData ();
        link.LinkType = (string) obj ["LinkType" + index];
        link.LinkUrl = (string) obj ["LinkUrl" + index];
        link.LinkShow = (int) obj ["LinkShow" + index] == 1;
        result.Links.Add (link);
    }
    return result;
}


 public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    JObject obj = JObject.Load (reader);
    LinksResult result = new LinksResult ();
    result.Count = (int) obj.GetValue ("count");
    result.ErrorCode = (int) obj.GetValue ("errorCode");
    result.ErrorMessage = obj.GetValue ("errorMessage").ToString ();
    result.Links = new List < LinkData > ();
    for (int i = 1; i <= result.Count; i ++) {
        string index = i.ToString ();
        LinkData link = new LinkData ();
        link.LinkType = obj.GetValue ("LinkType" + index).ToString ();
        link.LinkUrl = obj.GetValue ("LinkUrl" + index).ToString ();
        link.LinkShow = (int) obj.GetValue ("LinkShow" + index) == 1;
        result.Links.Add (link);
    }
    return result;
}


