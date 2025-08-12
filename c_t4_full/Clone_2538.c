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
#include <time.h>
int main () {
    time_t current_time;
    for (int n = 0; n < 20; n++) {
        time(&current_time);
        printf("Current Time: %s\r", ctime(&current_time));
        Sleep(2000);
    }
    printf("\n");
    return 0;
}


