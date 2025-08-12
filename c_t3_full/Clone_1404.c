int main () {
    time_t timer;
    char buffer [26];
    struct tm *tm_info;
    time (& timer);
    tm_info = localtime (&timer);
    strftime (buffer, 26, "%Y-%m-%d %H:%M:%S", tm_info);
    puts (buffer);
    return 0;
}


 int main () 
{ 
    time_t timer;
    char buffer[50];
    struct tm mytm; 
    
    time(&timer); 
    
    localtime_r(&timer, &mytm); 
  
    strftime(buffer, 50, "%Y-%m-%d %H:%M:%S", &mytm); 
    puts (buffer); 
  
    return 0; 
} 


