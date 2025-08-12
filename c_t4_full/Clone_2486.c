int main () {
    char buffer [SIZE];
    int i;
    srand ((unsigned) time (NULL));
    for (i = 0; i < SIZE; ++i)
        buffer[i] = (char) i;
    for (i = 0; i < NUMBER; ++i) {
        do
            shuffle (buffer, SIZE);
        while (buffer[0] == 0);
        printout (buffer, LENGTH);
    }
    return 0;
}





#define SIZE 5
#define LENGTH 5
#define NUMBER 5

void printout(char *arr, int len)
{
      for (int i=0; i<len; i++)
        printf("%d ", arr[i]);
      printf("\n");
    }

    void shuffle(char *arr, int n)
    {
      int i, j;
      char tmp;
      for (i = 0; i < n - 1; i++) {
        j = i + rand() / (RAND_MAX / (n - i) + 1);
        tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
      }
    }

    int main () {
      char buffer [SIZE];
      int i;
      srand ((unsigned) time (NULL));
      for (i = 0; i < SIZE; ++i)
        buffer[i] = (char) (i+65);
      for (i = 0; i < NUMBER; ++i) {
        do
          shuffle (buffer, SIZE);
        while (buffer[0] == 0);
        printout (buffer, LENGTH);
      }
      return 0;
}


