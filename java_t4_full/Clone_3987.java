private void sort (int [] input, int startIndx, int endIndx) {
    int endIndexOrig = endIndx;
    int startIndexOrig = startIndx;
    if (startIndx >= endIndx) return;
    int pavitVal = input [endIndx];
    while (startIndx <= endIndx) {
        while (input [startIndx] < pavitVal) startIndx ++;
        while (input [endIndx] > pavitVal) endIndx --;
        if (startIndx <= endIndx) {
            int tmp = input [startIndx];
            input [startIndx] = input [endIndx];
            input [endIndx] = tmp;
            startIndx ++;
            endIndx --;
        }
    }
    sort (input, startIndexOrig, endIndx);
    sort (input, startIndx, endIndexOrig);
}





void sortArray(int a[], int l, int h) { 
    int pivot,i,j,temp; 
    if (l<h) {
        pivot=l; 
        i=l; 
        j=h;
        while (i<j){
            while(a[i]<=a[pivot] && i<h) 
                i++; 
            while(a[j]>a[pivot])
                j--; 
            if(i<j) {
                temp=a[i]; 
                a[i]=a[j]; 
                a[j]=temp;
            }
        }
        temp=a[pivot]; 
        a[pivot]=a[j]; 
        a[j]=temp;
        sortArray(a,l,j-1); 
        sortArray(a,j+1,h);
    }
}


