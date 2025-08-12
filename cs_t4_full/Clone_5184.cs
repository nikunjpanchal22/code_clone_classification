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


 public static void Move<T> (this List<T> list, int oldIndex, int newIndex) {
    if (list != null && oldIndex < list.Count && newIndex < list.Count && oldIndex >= 0 && newIndex >= 0 && oldIndex != newIndex) {
        T tmp = list[oldIndex];
        int start = Math.Min(oldIndex, newIndex);
        int end = Math.Max(oldIndex, newIndex);
        int dir = (newIndex > oldIndex) ? 1 : -1;
        for (int i = start; i < end; i++) {
            list[i] = list[i + dir];
        }
        list[end] = tmp;
    }
}


