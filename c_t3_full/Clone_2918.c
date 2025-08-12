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
main_loop :
    switch (label) {
    case skip :
        printf("Skip");
        break;
    case run:
        printf("Run");
        break;
    case jump:
        printf("Jump");
        break;
    case scamper:
        printf("Scamper");
        break;
    default :
        printf ("Unknown state: %d\n", label);
        exit (0);
    }
    label = foo ();
    goto main_loop;
}


