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


  int main (void) 
{ 
    int n; 
    GetSystemTimesAddress(); 
    while(1)
    { 
        for (n = 0; n < 20; n++) 
        { 
            printf("CPU Usage: %3d%%\r", cpuusage()); 
            Sleep(2000); 
        } 
        Sleep(5000); 
    } 
    printf("\n"); 
    return 0; 
}
