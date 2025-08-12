private Update BuildMetaData (MetaData [] nvPairs) {
    Update update = new Update ();
    var ip = new List < InputProperty > ();
    foreach (var nvPair in nvPairs) {
        if (nvPair == null)
            break;
        var inputProp = new InputProperty {Name = "udf:" + nvPair.Name, Val = nvPair.Value};
        ip.Add (inputProp);
    }
    update.Items = ip.ToArray ();
    return update;
}


 private Update BuildMetaData (MetaData [] nvPairs) {
    Update update = new Update ();
    var ip = new List < InputProperty > ();
    int idx = 0;
    while (true) {
        if (idx == nvPairs.Length) break;
        if (nvPairs[idx] != null) {
            var inputProp = new InputProperty {Name = "udf:" + nvPairs[idx].Name, Val = nvPairs[idx].Value};
            ip.Add(inputProp);
        }
        else {
            break;
        }
        idx++;
    }
    update.Items = ip.ToArray ();
    return update;
}


