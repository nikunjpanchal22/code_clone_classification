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
        //Using bubble sort to move the elements 
        for (int j=r ; j<i-1; j++){
            int tmp = src[j];
            src[j] = src[j+1]; 
            src[j+1] = tmp; 
        }
    }
    for (i = 0; i < 20; printf ("%d ", tgt[i++]))
        ;
}
