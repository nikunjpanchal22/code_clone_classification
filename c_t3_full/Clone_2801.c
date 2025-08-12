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




 

#include<Windows.h>
#include<stdio.h>
int main () {
    int i;
    for(i=0; i<20; i++) {
        printf ("CPU Usage: %3d%%\r", i);
        Sleep (2000);
    }
    printf ("\n");
    return 0;
}


