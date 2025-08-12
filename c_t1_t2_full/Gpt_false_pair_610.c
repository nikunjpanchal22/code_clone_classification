int main () {
    int i, j, length;
    char space = ' ';
    char phrase [80];
    printf ("Give me the phrase: ");
    gets (phrase);
    length = strlen (phrase);
    for (i = 0, j = length - 1; i < j; i++, j--) {
        while (phrase[i] == space)
            i++;
        while (phrase[j] == space)
            j--;
        if (phrase[i] != phrase[j]) {
            printf ("It's not a palindrome\n");
            return 0;
        }
    }
    printf ("It's a palindrome\n");
    return 0;
}



 int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("Enter a phrase: ");
      scanf("%[^\n]s", phrase);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
          while (phrase[i] == space)
              i++;
          while (phrase[j] == space)
              j--;
          if (phrase[i] != phrase[j]) {
              printf("It's not a palindrome\n");
              return 0;
          }
      }
      printf("It's a palindrome\n");
      return 0;
  }	
 int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("Enter a phrase: ");
      fgets(phrase, 80, stdin);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
          while (phrase[i] == space)
              i++;
          while (phrase[j] == space)
              j--;
          if (phrase[i] != phrase[j]) {
              printf("It's not a palindrome\n");
              return 0;
          }
      }
      printf("It's a palindrome\n");
      return 0;
  }	
int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("Give me a phrase: ");
      fgets(phrase,80,stdin);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
         while(phrase[i] == space)
            i++;
         while(phrase[j] == space)
            j--;
         if(phrase[i] != phrase[j]) {
            printf("This phrase is not a palindrome\n");
            return 0;
         }
      }
      printf("This phrase is a palindrome\n");
      return 0;
   }
 int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("Input a phrase to check for palindromes: ");
      fgets(phrase,80,stdin);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
          while(phrase[i] == space)
              i++;
          while(phrase[j] == space)
              j--;
          if(phrase[i] != phrase[j]) {
              printf("This phrase is not a palindrome\n");
              return 0;
          }
      }
      printf("This phrase is a palindrome\n");
      return 0;
   }
 int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("Please input a phrase: ");
      fgets(phrase,80,stdin);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
          while(phrase[i] == space)
              i++;
          while(phrase[j] == space)
              j--;
          if(phrase[i] != phrase[j]) {
              printf("It's not a palindrome\n");
              return 0;
          }
      }
      printf("It's a palindrome\n");
      return 0;
   }
 int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("Type in a phrase: ");
      fgets(phrase,80,stdin);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
          while(phrase[i] == space)
              i++;
          while(phrase[j] == space)
              j--;
          if(phrase[i] != phrase[j]) {
              printf("Not a palindrome\n");
              return 0;
          }
      }
      printf("It is a palindrome\n");
      return 0;
   }
 int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("Input a phrase: ");
      fgets(phrase,80,stdin);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
          while(phrase[i] == space)
              i++;
          while(phrase[j] == space)
              j--;
          if(phrase[i] != phrase[j]) {
              printf("Not a palindrome\n");
              return 0;
         }
      }
      printf("It is a palindrome\n");
      return 0;
   }
 int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("Enter a phrase: ");
      fgets(phrase,80,stdin);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
          while(phrase[i] == space)
              i++;
          while(phrase[j] == space)
              j--;
          if(phrase[i] != phrase[j]) {
              printf("It is not a palindrome\n");
              return 0;
         }
      }
      printf("It is a palindrome\n");
      return 0;
   }
 int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("Please enter a phrase: ");
      fgets(phrase,80,stdin);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
          while(phrase[i] == space)
              i++;
          while(phrase[j] == space)
              j--;
          if(phrase[i] != phrase[j]) {
              printf("No palindrome\n");
              return 0;
         }
      }
      printf("It is a palindrome\n");
      return 0;
   }
 int main() {
      int i, j, length;
      char space = ' ';
      char phrase[80];
      printf("enter a phrase: ");
      fgets(phrase,80,stdin);
      length = strlen(phrase);
      for (i = 0, j = length - 1; i < j; i++, j--) {
          while(phrase[i] == space)
              i++;
          while(phrase[j] == space)
              j--;
          if(phrase[i] != phrase[j]) {
              printf("It isn't a palindrome\n");
              return 0;
          }
      }
      printf("It is a palindrome\n");
      return 0;
  }
