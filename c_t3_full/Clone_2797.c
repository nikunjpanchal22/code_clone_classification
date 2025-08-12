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
int main () {
        DWORD dwThreadIdArray[20]; 
        int n;
        CreateThread(NULL, 0, GetSystemTimesAddress, &dwThreadIdArray[n], 0, &dwThreadIdArray[n]);
        for (n = 0; n < 20; n++) {
            printf ("Thread ID: %3d%%\r", dwThreadIdArray[n]);
            Sleep (2000);
        }
        printf ("\n");
        return 0;
}


