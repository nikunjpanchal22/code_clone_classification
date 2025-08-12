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
    int size = tagList.Count;
    for (int i = 0; i < size; i++) {
        if (tagList[i].FieldTag == fieldTag) {
            if (i + 1 >= tagList.Count)
                return null;
            return tagList[i+1].Position;
        }
    }
    return null;
}


