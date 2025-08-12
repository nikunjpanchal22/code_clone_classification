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



  int main ()
{
    struct tm *utc, *gmt;
    time_t t;
    t = time (NULL);
    // Format it from UTC to local
    utc = localtime (&t);
    printf ("Local time and date: %s\n", asctime (utc));
    // Output UTC time
    gmt = gmtime (&t);
    printf ("UTC time and date: %s\n", asctime (gmt));
    return 0;
}


