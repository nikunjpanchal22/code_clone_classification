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
    enum {skip = -1, run, jump, scamper} label = skip;

computeGoto :
    switch (label) {
        case skip :
            break;
        case run :
            printf ("Running\n");
            label = foo();
            goto computeGoto;
        case jump :
            printf ("Jumping\n");
            label = foo();
            goto computeGoto;
        case scamper :
            printf ("Scampering\n");
            label = foo();
            goto computeGoto;
        default :
            printf ("Unknown state: %d\n", label);
            exit (0);
    }
}


