main () {
    int msqid;
    int msgflg = IPC_CREAT | 0666;
    key_t key;
    struct msgbuf sbuf;
    size_t buflen;
    key = 1234;
    if ((msqid = msgget (key, msgflg)) < 0)
        die ("msgget");
    sbuf.mtype = 1;
    printf ("Enter a message to add to message queue : ");
    scanf ("%[^\n]", sbuf.mtext);
    getchar ();
    buflen = strlen (sbuf.mtext) + 1;
    if (msgsnd (msqid, &sbuf, buflen, IPC_NOWAIT) < 0) {
        printf ("%d, %d, %s, %d\n", msqid, sbuf.mtype, sbuf.mtext, buflen);
        die ("msgsnd");
    }
    else
        printf ("Message Sent\n");
    exit (0);
}


 
main () {
    int msqid = 0;
    int msgflg = IPC_CREAT | 0666;
    key_t key;
    struct msgbuf sbuf;
    size_t buflen;
    key = 1234;
    msqid = msgget(key, msgflg);
    if (msqid == -1)
        die ("msgget failed");
    sbuf.mtype = 1;
    printf ("Enter a message to add to message queue : ");
    scanf ("%[^\n]", sbuf.mtext);
    getchar ();
    buflen = strlen (sbuf.mtext) + 1;
    int sendResult = msgsnd(msqid, &sbuf, buflen, IPC_NOWAIT);
    if (sendResult < 0) {
        printf ("%d, %d, %s, %d\n", msqid, sbuf.mtype, sbuf.mtext, buflen);
        die ("msgsnd failed");
    }
    else
        printf ("Message sent successfully\n");
    exit (EXIT_SUCCESS);
}


