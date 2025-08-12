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



private Update BuildMetaData(MetaData[] nvPairs)
{
    List<InputProperty> ipList = new List<InputProperty>();
    foreach(var pair in nvPairs)
    {
        if(pair == null) break;
        ipList.Add(new InputProperty { Name = "udf:" + pair.Name, Val = pair.Value});
    }
    Update update = new Update { Items = ipList.ToArray() };
    return update;
}


