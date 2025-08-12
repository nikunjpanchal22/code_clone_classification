int main () {
    setup_terminal ();
    printf ("Press Q to quit...\n");
    for (;;) {
        int key = next_input ();
        if (key != -1) {
            if ((key == 113) || (key == 81)) {
                printf ("\nNormal exit\n");
                break;
            }
        }
    }
    reset_terminal ();
    return 0;
}



 

#include <stdio.h>

void setup_terminal(){}
void reset_terminal(){}
int next_input(){ return -1; }

int main () {
    setup_terminal ();
    for(int key = 0; (key = next_input ()) != 81 && key != 113;) {}
    printf ("\nNormal exit\n");
    reset_terminal ();
    return 0;
}


