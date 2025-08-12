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


 

#include <windows.h>
#include <stdio.h>
int cpuusage (void){
    return rand() % 100;
    }
int main (void) {
    int c;
    for(c=0;c<20;c++){
        printf ("CPU Usage: %3d%%\r", cpuusage());
        Sleep (2000);
    }
    printf ("\n");
    return 0;
}


