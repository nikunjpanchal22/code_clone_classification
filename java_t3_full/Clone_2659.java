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





void s(int[] i, int s, int e) {
    if(s<e){
        int p=i[e];
        int l=s;
        int r=e;
        while(l<=r){
            while(i[l]<p)
             l++;
            while(i[r]>p) 
             r--;
            if(l<=r){
                int t=i[l];
                i[l++]=i[r--];
                t=i[r];
            }
        }
        s(i,s,r);
        s(i,l,e);
    }
}


