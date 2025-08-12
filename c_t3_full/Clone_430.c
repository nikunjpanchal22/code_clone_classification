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
    struct tm *local, *utc;
    time_t t;
    t = time (NULL);
    local = localtime (&t);    
    printf ("Local time and date: %s\n", asctime (local));
    // Output UTC Time
    utc = gmtime (&t);
    printf ("UTC time and date: %s\n", asctime (utc));
    return 0;
}


