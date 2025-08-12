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
int main(void) {
    int p = 0;
    while(p<20) {
        printf ("CPU Usage: %3d%%\r", p);
        Sleep(2000);
        p++;
    }
    printf("\n");
    return 0;
}


