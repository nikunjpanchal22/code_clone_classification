int main (void) {
    time_t now = time (0);
    struct tm local = *localtime (&now);
    struct tm utc = *gmtime (&now);
    time_t t1 = mktime (&local);
    time_t t2 = my_timegm (&utc);
    assert (t1 == t2);
    printf ("t =%lu\nt1=%lu\nt2=%lu\n", now, t1, t2);
    return 0;
}




time_t my_timegm(struct tm* tm) { 
    time_t ret; 
    char *tz;
    tz=_strdup(getenv("TZ")); 
    putenv("TZ=UTC"); 
    _tzset(); 
    ret=mktime(tm); 
    putenv(tz); 
    _tzset(); 
    return ret; 
}


