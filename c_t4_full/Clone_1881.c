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





#include <stdio.h>

typedef struct {
	    char firstName[30];
	    char lastName[30];
	    int dayOfBirth;
	    int monthOfBirth;
	    int yearOfBirth;
	} Student;

	void getStudents(Student *students, int numStudents) {
	    for(int i = 0; i < numStudents; i++) {
		printf("Enter student's first name, last name, and date of birth (day, month, year):\n");
		scanf("%s %s %d %d %d", students[i].firstName, students[i].lastName, &students[i].dayOfBirth, &students[i].monthOfBirth, &students[i].yearOfBirth);
	    }
	}

	void printStudents(Student *students, int numStudents) {
	    for(int i = 0; i < numStudents; i++) {
		printf("First name: %s, Last name: %s, Date of birth: %d / %d / %d\n", students[i].firstName, students[i].lastName, students[i].dayOfBirth, students[i].monthOfBirth, students[i].yearOfBirth);
	    }
	}

	int main() {
	    int numStudents = 3;
	    Student students[numStudents];
	    getStudents(students, numStudents);
	    printStudents(students, numStudents);
	    return 0;
}


