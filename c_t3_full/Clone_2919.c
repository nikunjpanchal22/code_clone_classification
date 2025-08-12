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
    enum {skip = -1, run, jump, crawl} label = skip;
operation :
    switch (label) {
    case skip :
        break;
    case run:
        runOperation();
        break;
    case jump:
        jumpOperation();
        break;
    case crawl:
        crawlOperation();
        break;
    default :
        printf ("Unknown state: %d\n", label);
        exit (1);
    }
    label = foo ();
    goto operation;
}


