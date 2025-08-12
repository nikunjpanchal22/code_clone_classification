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
    for (n = 0; n < 20; n++) 
    { 
        for(int i=0; i<5; i++)
        { 
            printf("CPU Usage: %3d%%\r", cpuusage()); 
            Sleep(400); 
        } 
        Sleep(2000); 
    } 
   printf("\n"); 
   return 0; 
}
