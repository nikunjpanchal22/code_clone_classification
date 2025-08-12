private static object SearchPositionUsingIndex (List < TagType < object > > tagList, string fieldTag) {
    var index = BuildIndex (tagList);
    int i;
    if (! index.TryGetValue (fieldTag, out i))
        return null;
    if (i + 1 >= tagList.Count)
        return null;
    return tagList [i + 1].Position;
}


  private static object SearchPositionUsingIndex (List < TagType < object > > tagList, string fieldTag) {
    Dictionary<string, int> index = BuildIndex (tagList);
    int i;
    if (index.TryGetValue (fieldTag, out i)) {
        if (i + 1 < tagList.Count) {
            TagType<object> tag = tagList[i+1];
            return tag.Position;
        }
    }
    return null;
}


