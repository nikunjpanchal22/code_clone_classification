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


 int main (int argc, char **argv) { 
    int numStudents; 
    int i;
    STUDENT *students; 
    
    printf("Enter number of students:");
    scanf("%d", &numStudents);
    students = malloc(sizeof(STUDENT) * numStudents); 
    
    for (i = 0; i < numStudents; i++) { 
        students[i].firstName = (char *)malloc(sizeof(char *) * 20); 
        printf("Enter First Name:"); 
        scanf("%s", students[i].firstName); 
        students[i].lastName= (char *)malloc(sizeof(char *) * 20); 
        printf("Enter Last Name:"); 
        scanf("%s", students[i].lastName); 
        printf("Enter Birth Day:"); 
        scanf("%d", &students[i].day); 
        printf("Enter Birth Month:"); 
        scanf("%d", &students[i].month); 
        printf("Enter Year:"); 
        scanf("%d", &students[i].year); 
    } 
    
    for (i = 0; i < numStudents; i++) 
        printf("Name: %s %s, %02d/%02d/%04d\n", students[i].firstName, students[i].lastName, students[i].day, students[i].month, students[i].year); 
    
    return (EXIT_SUCCESS); 
} 


