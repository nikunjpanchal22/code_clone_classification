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
    Update u = new Update()
    {
        Items = nvPairs
                 .TakeWhile(x => x != null)
                 .Select(x => new InputProperty { Name = "udf:" + x.Name, Val = x.Value })
                 .ToArray()
    };
    return u;
}


