private static object SearchPositionUsingIndex (List < TagType < object > > tagList, string fieldTag) {
    var index = BuildIndex (tagList);
    int i;
    if (! index.TryGetValue (fieldTag, out i))
        return null;
    if (i + 1 >= tagList.Count)
        return null;
    return tagList [i + 1].Position;
}


 private static object SearchPositionUsingIndex (List<TagType<object>> tags, string key)
{
    Dictionary<string,int> index = BuildIndex (tags); 
    if(index.ContainsKey(key))
    {
        int indexValue = index[key];
        if(indexValue + 1 < tags.Count)
            return tags[indexValue + 1].Position;
    }
    return null;
}


