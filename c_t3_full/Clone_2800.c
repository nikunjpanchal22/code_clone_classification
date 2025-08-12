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





#include<windows.h>
#include<stdio.h>
int main () {
    int j;
    for(j=0; j<20; ++j) {
        printf ("CPU Usage: %3d%%\r", j);
        Sleep(2000);
    }
    printf("\n");
    return 0;
}


