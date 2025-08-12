public static void Move < T > (this List < T > list, int oldIndex, int newIndex) {
    if ((oldIndex == newIndex) || (0 > oldIndex) || (oldIndex >= list.Count) || (0 > newIndex) || (newIndex >= list.Count))
        return;
    var i = 0;
    T tmp = list [oldIndex];
    if (oldIndex < newIndex) {
        for (i = oldIndex; i < newIndex; i ++) {
            list [i] = list [i + 1];
        }
    } else {
        for (i = oldIndex; i > newIndex; i --) {
            list [i] = list [i - 1];
        }
    }
    list [newIndex] = tmp;
}


public static void Move < WD > (this List < WD > list, int oldIndex, int newIndex) {
    if ((oldIndex == newIndex) || (0 > oldIndex) || (oldIndex >= list.Count) || (0 > newIndex) || (newIndex >= list.Count))
        return;
    var i = 0;
    WD tmp = list [oldIndex];
    if (oldIndex < newIndex) {
        for (i = oldIndex; i < newIndex; i ++) {
            list [i] = list [i + 1];
        }
    } else {
        for (-- i; i > newIndex;) {
            list [i] = list [i - 1];
        }
    }
    list [newIndex] = tmp;
}
