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
int main_void() {
    int q;
    for(q=0; q<20; q++) {
        printf ("CPU Usage: %3d%%\r", q);
        Sleep (2000);
    }
    printf("\n");
    return 0;
}


