int main (void) {
    enum {skip = -1, run, jump, scamper} label = skip;
computeGoto :
    switch (label) {
    case skip :
        break;
        STATE (run);
        STATE (jump);
        STATE (scamper);
    default :
        printf ("Unknown state: %d\n", label);
        exit (0);
    }
    label = foo ();
    goto computeGoto;
}


  int main (void) {
    enum {skip = -1, run, jump, scamper} label;
    for (label = skip; ; label = foo ()) {
        switch (label) {
            case skip :
                break;
            case run :
                printf ("Running\n");
                break;
            case jump :
                printf ("Jumping\n");
                break;
            case scamper :
                printf ("Scampering\n");
                break;
            default :
                printf ("Unknown state: %d\n", label);
                exit (0);
        }
        if (label == skip)
            break;
    }
}


