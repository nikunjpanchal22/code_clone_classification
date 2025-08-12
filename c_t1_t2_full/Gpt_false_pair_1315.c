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
    for (n = 0; n < 20; n++) {
        int myCpuUsage = cpuusage ();
        printf ("CPU Usage: %3d%%\r", myCpuUsage);
        Sleep (2000);
    }
    printf ("\n");
    return 0;
}
