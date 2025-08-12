void main () {
    int elesize = sizeof (int);
    int i;
    int r;
    int src [20];
    int tgt [20];
    for (i = 0; i < 20; src[i] = i++)
        ;
    srand ((unsigned int) time (0));
    for (i = 20; i > 0; i--) {
        r = rand () % i;
        memcpy (& tgt [20 - i], & src [r], elesize);
        memcpy (& src [r], & src [i - 1], elesize);
    }
    for (i = 0; i < 20; printf ("%d ", tgt[i++]))
        ;
}


 void main () {
    int elesize = sizeof (int);
    int i;
    int r;
    int src [20];
    int tgt [20];
    for (i = 0; i < 20; src[i] = i++)
        ;
    srand ((unsigned int) time (0));
    for (i = 20; i > 0; i--) {
        r = rand () % i;
		//Copy the element
        memcpy (& tgt [20 - i], & src [r], elesize);
		//Using Merge Sort to move the elements 
        int temp = src[r];
        int left = 0;
        int right = i-1;
        int mid = (left + right)/2;
        while(r!=mid){
            if(r<mid){
                right = mid;
            }
            else{
                left = mid;
            }
            mid = (left + right)/2;
            src[r] = src[mid]; 
            src[mid] = temp;
        }
    }
    for (i = 0; i < 20; printf ("%d ", tgt[i++]))
        ;
}


