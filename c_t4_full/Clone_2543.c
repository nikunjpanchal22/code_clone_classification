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
void main() {
    for(int a=0; a<20; a++) {
        printf ("CPU Usage: %3d%%\r", a);
        Sleep(2000);
    }
    printf("\n");
}


