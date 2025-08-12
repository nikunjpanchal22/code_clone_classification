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
    POINT p;
    p.x = 10;
    if (p.x != SetCursorPos(p.x, p.y)) printf("SetCursorPos Error\n");
    for (int n = 0; n < 20; n++) {
        printf("Set Mouse Position to: %3d\r", p.x);
        Sleep(2000);
    }
    printf("\n");
    return 0;
}


