int main (void) {
    int n;
    GetSystemTimesAddress ();
    for (n = 0; n < 20; n++) {
        printf ("CPU Usage: %3d%%\r", cpuusage ());
        Sleep (2000);
    }
    printf ("\n");
    return 0;
}




#include <stdlib.h>
#include <stdio.h>
int main () {
    char command[50];
    for (int n = 0; n < 20; n++) {
        sprintf(command, "COMMAND %d", n);
        system(command);
        Sleep(2000);
    }
    printf("\n");
    return 0;
}


