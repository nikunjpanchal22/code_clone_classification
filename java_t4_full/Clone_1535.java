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


 
static int [] sort (int arr[]){
    int n = arr.length;
    int gap = n;
    boolean swapped = true;
    while (gap != 1 || swapped == true)
    {
        gap = getNextGap(gap);
        swapped = false;
        for (int i=0; i<n-gap; i++)
        {
            if (arr[i] > arr[i+gap])
            {
                int temp = arr[i];
                arr[i] = arr[i+gap];
                arr[i+gap] = temp;
                swapped = true;
            }
        }
    }
    return arr;
	}

	private static int getNextGap(int gap)
	{
	    gap = (gap*10)/13;
	    if (gap < 1)
		return 1;
	    return gap;
}


