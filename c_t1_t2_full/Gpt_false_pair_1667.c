int main () {
    char buffer [26];
    int millisec;
    struct tm *tm_info;
    struct timeval tv;
    gettimeofday (& tv, NULL);
    millisec = lrint (tv.tv_usec / 1000.0);
    if (millisec >= 1000) {
        millisec -= 1000;
        tv.tv_sec++;
    }
    tm_info = localtime (&tv.tv_sec);
    strftime (buffer, 26, "%Y:%m:%d %H:%M:%S", tm_info);
    printf ("%s.%03d\n", buffer, millisec);
    return 0;
}


 int main(){
    char buffer[26];
    int millisec;
    struct tm *tm_info;
    time_t currTime;
    struct timeval tv;
    gettimeofday(&tv,NULL);
    currTime=tv.tv_sec;
    tm_info=localtime(&currTime);
    strftime (buffer, 26, "%Y-%m-%d %H:%M:%S", tm_info);
    millisec=lrint(tv.tv_usec/1000.0);
    if(millisec>=1000){
        millisec-= 1000;
        tv.tv_sec++;
    }
    printf("%s.%03d\n", buffer, millisec);
    return 0;
}
