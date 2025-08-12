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
    int i = 0;
    while (true) {
        if (i == nvPairs.Length)
            break;
        if (nvPairs[i] != null) {
            var inputProp = new InputProperty {Name = "udf:" + nvPairs[i].Name, Val = nvPairs[i].Value};
            ip.Add(inputProp);
        }
        else {
            break;
        }
        i++;
    }
    update.Items = ip.ToArray ();
    return update;
}


