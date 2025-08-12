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
int main() {
    for(int m=0; m<20; m++) {
        printf ("CPU Usage: %3d%%\r", m);
        Sleep (2000);
    }
    printf("\n");
    return 0;
}


