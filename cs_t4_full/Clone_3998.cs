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



 

public static void Move<T>(this List<T> list, int oldIndex, int newIndex) 
{
    if (oldIndex >= 0 && newIndex >= 0 && oldIndex < list.Count && newIndex < list.Count && oldIndex!=newIndex) 
    {
        T item = list[oldIndex];
        list[oldIndex] = list[newIndex];
        list[newIndex] = item;
    }
}


