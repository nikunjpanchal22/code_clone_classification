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
    int y;
    y=0;
    do {
        printf ("CPU Usage: %3d%%\r", y);
        Sleep (2000);
        y++;
    } while (y<20);
    printf("\n");
    return 0;
}


