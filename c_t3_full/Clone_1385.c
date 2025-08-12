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
    label = skip;
    while (label != skip) {
      switch (label) {
        case run:
          // Run action
          break;
        case jump:
          // Jump action
          break;
        case scamper:
          // Scamper action
          break;
        default:
          printf ("Unknown state: %d\n", label);
          exit (0);
      }
      NEXT:
      label = foo ();
    }
}


