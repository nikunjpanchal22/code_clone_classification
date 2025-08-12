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
    List < InputProperty > ipList = new List<InputProperty>();
    for (int i = 0; i < nvPairs.Length; i++) {
        if (nvPairs[i] != null) {
            var inputProp = new InputProperty {Name = "udf:" + nvPairs[i].Name, Val = nvPairs[i].Value};
            ipList.Add(inputProp);
        }
        else {
            break;
        }
    }
    update.Items = ipList.ToArray();
    return update;
}


