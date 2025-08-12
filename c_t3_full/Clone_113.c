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
    int index;
    int src [20];
    int tgt [20];
    for (i = 0; i < 20; src[i] = i++)
        ;
    srand ((unsigned int) time (0));
    i = 20;
    while (i > 0) {
        index = rand() % i;
        tgt[20 - i] = src[index]; 
        src[index] = src[i-1]; 
        i--; 
    }
    for (i = 0; i < 20; printf ("%d ", tgt[i++]))
        ;
}


