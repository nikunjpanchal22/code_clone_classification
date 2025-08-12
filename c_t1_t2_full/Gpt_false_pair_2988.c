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


int main (void) {
    struct tm *local;
    time_t t;
    t = time (NULL);
    localtime_s (&t, &local);
    printf ("Local time and date: %s\n", asctime (local));
    gmtime_s (&t, &local);
    printf ("UTC time and date: %s\n", asctime (local));
    return 0;
}
