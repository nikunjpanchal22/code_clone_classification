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
    if (!GetCursorPos(&p)) printf("GetCursorPos Error\n");
    for (int n = 0; n < 20; n++) {
        printf("Mouse Position: %3d\r", p.x);
        Sleep(2000);
    }
    printf("\n");
    return 0;
}


