int main (void) {
    struct tm *local;
    time_t t;
    t = time (NULL);
    local = localtime (&t);
    printf ("Local time and date: %s\n", asctime (local));
    local = gmtime (&t);
    printf ("UTC time and date: %s\n", asctime (local));
    return 0;
}


 int main()
{
    struct tm *local_t;
    struct tm *utc_t;
    time_t t;
    t = time (NULL);

    char local[100];
    char utc[100];

    local_t = localtime (&t);
    strftime (local, 100, "Local time and date: %A %d %B %Y %X\n", local_t);
    printf("%s", local);
 
    utc_t = gmtime (&t);
    strftime (utc, 100, "UTC time and date: %A %d %B %Y %X\n", utc_t);
    printf("%s", utc); 

    return 0;
}


