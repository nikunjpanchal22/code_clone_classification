static int [] sort (int arr []) {
    for (int i = 0;
    i < arr.length; i ++) {
        for (int j = i;
        j < arr.length; j ++) {
            if (arr [j] < arr [i]) {
                int temp = arr [i];
                arr [i] = arr [j];
                arr [j] = temp;
            }
        }
    }
    return arr;
}


 
static int [] sort (int arr []) {
    int n = arr.length;
    for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) { 
        int item = arr [cycleStart];
        int pos = cycleStart; 
        for (int i = cycleStart + 1; i < n; i++) 
            if (arr [i] < item) 
                pos ++;
        if (pos == cycleStart) 
            continue;
        while (item == arr [pos]) 
            pos += 1;
        if (pos != cycleStart) { 
            int temp = item; 
            item = arr [pos]; 
            arr [pos] = temp; 
        }
        while (pos != cycleStart) { 
            pos = cycleStart; 
            for (int i = cycleStart + 1; i < n; i++) 
                if (arr [i] < item) 
                    pos += 1; 
            while (item == arr [pos]) 
                pos += 1;
            if (item != arr [pos]) { 
                int temp = item; 
                item = arr[pos]; 
                arr [pos] = temp; 
            }
        }
    }
    return arr;
}


