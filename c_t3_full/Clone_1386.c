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
    while (label != skip) {
      switch (label) {
        case run:
          // Run action
          goto finish;
        case jump:
          // Jump action
          goto finish;
        case scamper:
          // Scamper action
          goto finish;
        default:
          printf ("Unknown state: %d\n", label);
          exit (0);
      }
      finish:
      label = foo ();
    }
}


