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
    var index = BuildIndex (tagList);
    int i;
    if (! index.TryGetValue (fieldTag, out i))
        return null;
    if (i + 1 >= tagList.Count || (i + 2 >= tagList.Count && tagList[i+1].Tag != fieldTag))
        return null;
    return tagList [i + 1].Position;
}
