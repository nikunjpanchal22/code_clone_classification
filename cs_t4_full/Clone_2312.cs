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




private Update BuildMetaData(MetaData[] pairs)
{
    Update update = new Update();
    update.Items = pairs.TakeWhile(pair => pair != null)
                        .Select(pair => new InputProperty { Name = "udf:" + pair.Name, Val = pair.Value })
                        .ToArray();
    return update;
}


