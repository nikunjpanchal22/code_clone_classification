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
    for (int i = 0; i < tagList.Count; i++) {
        TagType<object> tag = tagList[i];
        if (tag.FieldTag == fieldTag && tagList.Count - 1 > i) 
            return tagList[i+1].Position;
    }
    return null;
}


