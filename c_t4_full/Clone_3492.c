int main (void) {
    char buffer [32];
    struct tm *ts;
    size_t last;
    time_t timestamp = time (NULL);
    ts = localtime (&timestamp);
    last = strftime (buffer, 32, "%A", ts);
    buffer[last] = '\0';
    printf ("%s\n", buffer);
    return 0;
}






int main (){
    char buffer [32];
    time_t timestamp;
    timestamp = time (NULL);
    strftime (buffer, sizeof(buffer), "%A %p", localtime(&timestamp));
    puts(buffer);
    return 0;
}


