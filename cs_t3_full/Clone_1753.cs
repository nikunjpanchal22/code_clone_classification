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
    result.Count = (int)obj.Value<int>("count");
    result.ErrorCode = (int)obj.Value<int>("errorCode");
    result.ErrorMessage = obj.Value<string>("errorMessage");
    result.Links = new List < LinkData > ();
    for (int i = 1; i <= result.Count; i ++) {
        string index = i.ToString ();
        LinkData link = new LinkData ();
        link.LinkType = obj.Value<string>("LinkType" + index);
        link.LinkUrl = obj.Value<string>("LinkUrl" + index);
        link.LinkShow = (int)obj.Value<int>("LinkShow" + index) == 1;
        result.Links.Add (link);
    }
    return result;
}


