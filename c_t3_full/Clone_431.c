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
    time_t t;
    struct tm *localTime, *GMTTime;

    t = time(NULL);
    localTime = localtime(&t);
    printf("Local time and date: %s\n", asctime(localTime));
    GMTTime = gmtime(&t);
    printf("UTC time and date: %s\n", asctime(GMTTime));

    return 0;
}


