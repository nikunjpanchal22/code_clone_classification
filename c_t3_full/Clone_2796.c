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
int main () {
    MEMORYSTATUSEX statex;
    statex.dwLength = sizeof (statex);
    int n;
    GlobalMemoryStatusEx (&statex);
    for (n = 0; n < 20; n++) {
        printf ("Memory in Use: %3d%%\r", statex.dwMemoryLoad);
        Sleep (2000);
    }
    printf ("\n");
    return 0;
}


