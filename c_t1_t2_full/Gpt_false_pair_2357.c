int main () {
    pthread_t tid;
    thread_data tdata;
    tdata.a = 10;
    tdata.b = 32;
    pthread_create (& tid, NULL, myThread, (void *) & tdata);
    pthread_join (tid, NULL);
    printf ("%d + %d = %d\n", tdata.a, tdata.b, tdata.result);
    return 0;
}


 int main () 
{ 
    pthread_t Thread_Id; 
    parameters_t tdata; 
    tdata.a = 10; 
    tdata.b = 32; 
    pthread_create(&Thread_Id, NULL, myThread, (void*)&tdata); 
    pthread_join(Thread_Id, NULL); 
    printf("%d + %d = %d\n", tdata.a, tdata.b, tdata.result); 
    return 0; 
}
