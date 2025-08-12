private static object SearchPositionUsingIndex (List < TagType < object > > tagList, string fieldTag) {
    var index = BuildIndex (tagList);
    int i;
    if (! index.TryGetValue (fieldTag, out i))
        return null;
    if (i + 1 >= tagList.Count)
        return null;
    return tagList [i + 1].Position;
}


 private static object FindPositionUsingIndex (List < TagType < object > > tagList, string fieldTag) {
    Dictionary < string, int > index = BuildIndex (tagList);

    if (index.ContainsKey (fieldTag)) {
        int i = index [fieldTag];

        if (i + 1 < tagList.Count) {
            return tagList [i + 1].Position;
        }
    }

    return null;
}


