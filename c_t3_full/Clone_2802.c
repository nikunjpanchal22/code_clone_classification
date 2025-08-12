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
void main() {
    int k;
    for(k=0; k<20; k++) {
        printf ("CPU Usage: %3d%%\r", k);
        Sleep(2000);
    }
    printf("\n");
}


