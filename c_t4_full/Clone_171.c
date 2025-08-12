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
    time_t tim;
    tim = time (NULL);
    char tmp[64];

    // Local time
    strftime(tmp, sizeof(tmp), "%c", localtime(&tim));
    printf("Local time and date: %s\n", tmp);

    // UTC time
    strftime(tmp, sizeof(tmp), "%c", gmtime(&tim));
    printf("UTC time and date: %s\n", tmp);

    return 0;
}


