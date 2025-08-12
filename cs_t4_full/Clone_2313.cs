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
    InputProperty[] inputProps = nvPairs
                                 .Where(nv => nv != null)
                                 .Select(nv => new InputProperty("udf:" + nv.Name, nv.Value))
                                 .ToArray();
    return new Update() { Items = inputProps };
}


