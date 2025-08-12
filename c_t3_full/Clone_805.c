int main (int argc, char **argv) {
    typedef struct {
        char *firstName;
        char *lastName;
        int day;
        int month;
        int year;
    } STUDENT;
    int numStudents = 3;
    int x;
    STUDENT *students = malloc (numStudents * sizeof *students);
    for (x = 0; x < numStudents; x++) {
        students[x].firstName = (char *) malloc (sizeof (char *));
        scanf ("%s", students [x].firstName);
        students[x].lastName = (char *) malloc (sizeof (char *));
        scanf ("%s", students [x].lastName);
        scanf ("%d", & students [x].day);
        scanf ("%d", & students [x].month);
        scanf ("%d", & students [x].year);
    }
    for (x = 0; x < numStudents; x++)
        printf ("first name: %s, surname: %s, day: %d, month: %d, year: %d\n", students[x].firstName, students[x].lastName, students[x].day, students[x].month, students[x].year);
    return (EXIT_SUCCESS);
}


 int main(int argc, char **argv) {
   STUDENT *students;
   int numStudents = 3;
   int x;

   students = (STUDENT *)malloc(numStudents * sizeof(STUDENT));

   for (x = 0; x < numStudents; x++) {
      students[x].firstName = (char *)malloc(sizeof(char *));
      printf("Enter first name: ");
      scanf("%s", students[x].firstName);

      students[x].lastName = (char *)malloc(sizeof(char *));
      printf("Enter last name: ");
      scanf("%s", students[x].lastName);

      printf("Enter day: ");
      scanf("%d", &students[x].day);
      
      printf("Enter month: ");
      scanf("%d", &students[x].month);

      printf("Enter year: ");
      scanf("%d", &students[x].year);
   }
   
   for (x = 0; x < numStudents; x++)
      printf("First name: %s, Surname: %s, Day: %d, Month: %d, Year: %d\n",
             students[x].firstName, students[x].lastName,
             students[x].day, students[x].month, students[x].year);

   return EXIT_SUCCESS;
}


