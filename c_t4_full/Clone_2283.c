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
    while(1) {
        int key = next_input ();
        if (key == 81 || key == 113) {
            break;
        }
    }
    printf ("Normal exit\n");
    reset_terminal ();
    return 0;
}


