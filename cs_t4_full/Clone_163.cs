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

    nvPairs.ToList().ForEach(nvPair => {

        if(nvPair == null)
            return;

        ipList.Add(new InputProperty {Name = "udf:" + nvPair.Name, Val = nvPair.Value});
    });
    
    update.Items = ipList.ToArray();
    return update;
}


