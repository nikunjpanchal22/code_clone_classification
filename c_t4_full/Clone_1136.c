int main (void) {
    struct timeval start, end;
    long mtime, secs, usecs;
    gettimeofday (& start, NULL);
    something_else ();
    gettimeofday (& end, NULL);
    secs = end.tv_sec - start.tv_sec;
    usecs = end.tv_usec - start.tv_usec;
    mtime = ((secs) *1000 + usecs / 1000.0) + 0.5;
    printf ("Elapsed time: %ld millisecs\n", mtime);
    return 0;
}





#include <mpi.h>

void something_else (void);

int main(int argc, char *argv[])
{
    double start, end, mtime;
    MPI_Init(&argc, &argv);

    start = MPI_Wtime();
    something_else();
    end = MPI_Wtime();
    
    mtime = (end - start) * 1000;
    printf("Elapsed time: %.2f millisecs\n", mtime);

    MPI_Finalize();
    return 0;
}


