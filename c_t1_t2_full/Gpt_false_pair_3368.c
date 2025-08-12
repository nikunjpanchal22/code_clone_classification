int main (void) {
    system ("stty raw");
    unsigned int count = 0;
    for (;;) {
        if (inputExists ()) {
            char input [256] = {0};
            read (0, input, 255);
            count += strlen (input);
            printf ("\rCount is now %d\n", count);
        }
        else if (count > 0) {
            count--;
            printf ("\rDecremented count to %d\n", count);
        }
        puts ("\rWaiting...");
        wait ();
    }
}


int main (void) {
    system ("stty raw");
    unsigned int count = 0;
    while (true) {
        if (inputExists ()) {
            char input [256] = {0};
            read (0, input, 255);
            count += stringLength (input);
            printf ("\rCount is now %d\n", count);
        }
        else if (count > 0) {
            count--;
            printf ("\rDecremented count to %d\n", count);
        }
        puts ("\rWaiting...");
        sleep ();
    }
}
