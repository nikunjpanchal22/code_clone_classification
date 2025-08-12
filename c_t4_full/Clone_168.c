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


 int main() {
    time_t timeNow;
    struct tm *timeInfoLocal;
    struct tm *timeInfoUTC;
    char timeBufferLocal[26];
    char timeBufferUTC[26];

    time(&timeNow); // Get current time

    // Format it from UTC to local
    timeInfoLocal = localtime(&timeNow);
    strftime(timeBufferLocal, 26, "%Y-%m-%d %H:%M:%S", timeInfoLocal);
    printf("Local time and date: %s\n", timeBufferLocal);

    // Change the format to UTC
    timeInfoUTC = gmtime(&timeNow);
    strftime(timeBufferUTC, 26, "%Y-%m-%d %H:%M:%S", timeInfoUTC);
    printf("UTC time and date: %s\n", timeBufferUTC);

    return 0;
}


