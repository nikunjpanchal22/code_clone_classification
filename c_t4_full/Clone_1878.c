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
	    typedef struct { 
		char *firstName; 
		char *lastName; 
		int dateOfBirth[3]; 
		} STUDENT; 
	    int numStudents = 3; 
	    STUDENT *students = malloc (numStudents * sizeof *students); 
	    for (int i = 0; i < numStudents; i++) { 
		students[i].firstName = malloc(128); 
		scanf ("%127s", students[i].firstName); 
		students[i].lastName = malloc(128); 
		scanf ("%127s", students[i].lastName); 
		for(int j=0; j<3; ++j) 
		    scanf ("%d", &students[i].dateOfBirth[j]); 
	    } 
	    for (int i = 0; i < numStudents; i++) 
		printf ("First Name: %s, Surname: %s, DOB: %02d/%02d/%04d\n", students[i].firstName, students[i].lastName, students[i].dateOfBirth[0], students[i].dateOfBirth[1], students[i].dateOfBirth[2]); 
	    return EXIT_SUCCESS; 
}


