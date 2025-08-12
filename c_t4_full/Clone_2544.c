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
int cpuUsage(){ return 0;}
int main() {
    int n;
    for(n = 0; n < 20; n++) {
        printf ("CPU Usage: %3d%%\r", cpuUsage());
        Sleep (2000);
    }
    printf ("\n");
    return 0;
}


