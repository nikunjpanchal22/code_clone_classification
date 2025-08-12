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
    List<InputProperty> ipList = new List<InputProperty>();

    Array.ForEach<MetaData>(nvPairs, nv => {

        if (nv == null) 
            return;

        var inputProp = new InputProperty {Name = "udf:" + nv.Name, Val = nv.Value};
        ipList.Add(inputProp);
    });
    
    update.Items = ipList.ToArray();
    return update;
}


