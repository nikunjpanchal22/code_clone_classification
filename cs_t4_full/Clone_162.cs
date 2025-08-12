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
    InputProperty[] ipArray = new InputProperty[nvPairs.Length];

    for(int i = 0; i < nvPairs.Length; i++) 
    {
        if(nvPairs[i] == null)
            break;

        var nvPairObj = nvPairs[i];
        ipArray[i] = new InputProperty {Name = "udf:" + nvPairObj.Name, Val = nvPairObj.Value};
    }
    update.Items = ipArray;
    return update;
}


