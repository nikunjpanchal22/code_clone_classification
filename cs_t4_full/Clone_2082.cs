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
                    if (((oldIndex < newIndex) || (oldIndex > newIndex)) && (oldIndex > 0 && oldIndex < list.Count && newIndex > 0 && newIndex < list.Count)) 
                    { 
                        T temp = list[oldIndex]; 
                        list.RemoveAt(oldIndex); 
                        list.Insert(newIndex, temp); // Inserts the element in its new index 
                    } 
                    else 
                    { 
                        return; 
                    } 
                } 

 public static void Move<T>(this List <T> list, int oldIndex, int newIndex) 
{ 
    if (oldIndex > newIndex || oldIndex != newIndex) 
    { 
        T prevVal = list[oldIndex]; 

        for (int i = oldIndex; i > newIndex; i--) 
            list[i] = list[i - 1]; 

        list[newIndex] = prevVal; 
    } 
    else 
    { 
        return; 
    } 
} 


