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
    int n;
    unsigned char drive[3] = "_:\\";
    for (drive[0] = 'C'; drive[0] <= 'Z'; drive[0]++) {
        if (GetDriveType(drive) == DRIVE_FIXED)
           printf("Drive %c: is a fixed drive.\n", drive[0]);
    }
    return 0;
}


