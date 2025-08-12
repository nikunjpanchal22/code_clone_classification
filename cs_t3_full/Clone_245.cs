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
    Update update = new Update();
    List<InputProperty> ip = new List<InputProperty>();

    for(int i = 0; i < nvPairs.Length; i++) 
    {
        if(nvPairs[i] == null)
            break;

        var nvObj = nvPairs[i];
        var inputProp = new InputProperty {Name = "udf:" + nvObj.Name, Val = nvObj.Value};
        ip.Add(inputProp);
    }
    update.Items = ip.ToArray();
    return update;
}


