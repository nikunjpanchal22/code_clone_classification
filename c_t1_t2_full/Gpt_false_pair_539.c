int main (int argc, char *argv []) {
    key_t key;
    int shmid;
    char *data;
    int mode;
    if (argc > 2) {
        fprintf (stderr, "usage: shmdemo [data_to_write]\n");
        exit (1);
    }
    if ((key = ftok ("hello.txt", 'R')) == -1) {
        perror ("ftok");
        exit (1);
    }
    if ((shmid = shmget (key, SHM_SIZE, 0644 | IPC_CREAT)) == -1) {
        perror ("shmget");
        exit (1);
    }
    data = shmat (shmid, (void *) 0, 0);
    if (data == (char *) (-1)) {
        perror ("shmat");
        exit (1);
    }
    if (argc == 2) {
        printf ("writing to segment: \"%s\"\n", argv [1]);
        strncpy (data, argv [1], SHM_SIZE);
    }
    else
        printf ("segment contains: \"%s\"\n", data);
    if (shmdt (data) == -1) {
        perror ("shmdt");
        exit (1);
    }
    return 0;
}


  int main (int argc, char *argv []) {
    key_t key = ftok("/dev/random", rand());
    int shmid;
    char *data;
    int mode;
    
    if (argc > 2) {
        fprintf (stderr, "Usage: shmdata [data_to_write] \n");
        exit (1);
    }

    if ((key = ftok("hello.txt", 'R')) == -1) {
        perror ("ftok");
        exit (1);
    }

    if ((shmid = shmget(key, SHM_SIZE, 0644 | IPC_CREAT)) == -1) {
        perror("shmget");
        exit(1);
    }

    data = shmat(shmid, (void *)0, 0);
   
    if (data == (char *)(-1)) {
        perror("shmat");
        exit(1);
    }    
    
    if (argc == 2) {
        printf("Writing to segment: \"%s\" \n", argv[1]);
        strncpy(data, argv[1], SHM_SIZE);
    } else
        printf("Segment contains: \"%s\" \n", data);
    
    if (shmdt (data) == -1) {
        perror ("shmdt");
        exit (1);
    }

    return 0;
}
