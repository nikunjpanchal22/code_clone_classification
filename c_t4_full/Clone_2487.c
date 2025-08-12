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





#define SIZE 10
#define LENGTH 10
#define NUMBER 10

void shuffle(char *arr, int n)
{
      for (int i = n-1; i>0; i--) {
        int j = rand() % (i+1);
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
      }
    }

    void printout(char *arr, int len)
    {
      for (int i=0; i<len; i++)
        printf("%d ", arr[i]);
      printf("\n");
    }

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


