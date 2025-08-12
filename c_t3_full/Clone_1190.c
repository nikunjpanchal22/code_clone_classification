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


 int main (void) {
    int n;
    GetSystemTimesAddress ();
    int x = 0;
    while (x < 20)
    {
        printf ("CPU Usage: %3d%%\r", cpuusage ());
        Sleep (2000);
        x++;
    }
    printf ("\n");
    return 0;
}


