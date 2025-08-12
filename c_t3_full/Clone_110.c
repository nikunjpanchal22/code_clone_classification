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
        memcpy (& tgt [20 - i], & src [r], elesize);
		//Using Heap Sort to move the elements 
        int temp = src[r];
        int j=r/2;
        while(j>0){
            if(src[j] > temp){
                src[r] = src[j];
                r = j;
                j = r/2;
            }
            else
                break;
        }
        src[r] = temp;
    }
    for (i = 0; i < 20; printf ("%d ", tgt[i++]))
        ;
}


