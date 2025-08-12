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
    // Declare a time structure
    time_t timer;
    char buffer[26];
    struct tm *localTime;
    // Store UTC time
    timer = time (NULL);
    // Format it from UTC to local
    localTime = localtime (&timer);
    // Convert it to a string
    strftime (buffer, 26, "%Y-%m-%d %H:%M:%S", localTime);
    printf ("Local time and date: %s\n", buffer);
    // Change the format to UTC
    localTime = gmtime (&timer);
    // Convert it to a string
    strftime (buffer, 26, "%Y-%m-%d %H:%M:%S", localTime);
    printf ("UTC time and date: %s\n", buffer);
    return 0;
}


