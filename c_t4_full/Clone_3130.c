int main (int argc, char *argv []) {
    int size;
    int rank;
    const int VERY_LARGE_INT = 999999;
    const int ROOT = 0;
    int tag = 1234;
    MPI_Init (& argc, & argv);
    MPI_Comm_size (MPI_COMM_WORLD, & size);
    MPI_Comm_rank (MPI_COMM_WORLD, & rank);
    int count = N / size;
    int *localArray = (int *) malloc (count * sizeof (int));
    int localMin;
    int globalMin;
    if (rank == ROOT) {
        for (int i = 0; i < N; i++) {
            A[i] = rand () % 10;
        }
        for (int i = 0; i < count; i++)
            localArray[i] = A[i];
        for (int dest = 1; dest < size; ++dest) {
            MPI_Send (& A [dest * count], count, MPI_INT, dest, tag, MPI_COMM_WORLD);
            printf ("P0 sent a %d elements to P%d.\n", count, dest);
        }
        localMin = VERY_LARGE_INT;
        for (int source = 1; source < size; source++) {
            MPI_Recv (localArray, count, MPI_INT, source, 2, MPI_COMM_WORLD, MPI_STATUS_IGNORE);
            printf ("Received results from task %d\n", source);
        }
    }
    else {
        MPI_Recv (localArray, count, MPI_INT, ROOT, tag, MPI_COMM_WORLD, MPI_STATUS_IGNORE);
        MPI_Send (localArray, count, MPI_INT, ROOT, 2, MPI_COMM_WORLD);
    }
    MPI_Finalize ();
    return 0;
}




#define N 16
int main (int argc, char *argv []) {
    int i, rank, size, tag = 1234, root=0, VERY_LARGE_INT=1000000;
    int* localArray, *A, count, localMin, globalMin;
    A = (int*)malloc(N * sizeof(int));
    MPI_Init(&argc, &argv);
    MPI_Comm_size(MPI_COMM_WORLD, &size);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    count = N/size;
    localArray = (int*)malloc(count * sizeof(int));
    if (rank == root) {
        for (i=0; i<N; i++) A[i] = rand()%10;
        MPI_Scatter(A, count, MPI_INT, localArray, count, MPI_INT, root, MPI_COMM_WORLD);
        for (i=1; i<size; i++) MPI_Recv(localArray, count, MPI_INT, i, 2, MPI_COMM_WORLD, MPI_STATUS_IGNORE);
    }
    else {
        MPI_Scatter(A, count, MPI_INT, localArray, count, MPI_INT, root, MPI_COMM_WORLD);
        MPI_Send(localArray, count, MPI_INT, root, 2, MPI_COMM_WORLD);
    }
    free(localArray);
    free(A);
    MPI_Finalize();
    return 0;
}


