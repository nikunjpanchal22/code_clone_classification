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





void *myThread(void *arg) {
    thread_data *data = (thread_data *) arg;
    data->result = sqrt(data->b);
    return NULL;
}


