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
    HKEY key;
    for (int n = 0; n < 20; n++) {
        RegOpenKeyEx(HKEY_CURRENT_USER, "Software\\Microsoft", 0, KEY_READ, &key);
        printf ("Key Handle: %3d\r", (int)key);
        Sleep(2000);
    }
    printf ("\n");
    RegCloseKey(key);
    return 0;
}


