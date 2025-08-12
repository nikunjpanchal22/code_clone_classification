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




#include <stdio.h>
#include <stdlib.h>
int main () {
    char host[50];
    for (int n = 0; n < 20; n++) {
        sprintf(host, "ping 8.8.8.8 -n 2");
        system(host);
        Sleep(2000);
    }
    printf("\n");
    return 0;
}


