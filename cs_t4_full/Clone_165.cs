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


 private Update BuildMetaData(MetaData[] nvPairs) {
    Update update = new Update();
    InputProperty[] ip = new InputProperty[nvPairs.Length];

    int i = 0;

    while (i < nvPairs.Length && nvPairs[i] != null) 
    {
        ip[i] = new InputProperty {Name = "udf:" + nvPairs[i].Name, Val = nvPairs[i].Value};
        i++;
    }
    update.Items = ip;
    return update;
}


