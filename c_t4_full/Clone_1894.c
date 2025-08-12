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
#include <stdlib.h>

typedef struct {
	    char *firstName;
	    char *lastName;
	    int birth[3];
	} Student;

	Student* newStudent() {
	    Student* newStudent = (Student*) malloc(sizeof(Student));
	    newStudent->firstName = (char*) malloc(sizeof(char) * 20);
	    newStudent->lastName = (char*) malloc(sizeof(char) * 20);
	    scanf("%s %s %d %d %d", newStudent->firstName, newStudent->lastName, &newStudent->birth[0], &newStudent->birth[1], &newStudent->birth[2]);
	    return newStudent;
	}

	void printStudent(Student* student) {
	    printf("First Name: %s, Last Name: %s, Birth: %d-%d-%d\n", student->firstName, student->lastName, student->birth[0], student->birth[1], student->birth[2]);
	}

	int main(int argc, char** argv) {
	    Student* students[3];
	    for (int i = 0; i < 3; i++) {
		students[i] = newStudent();
	    }

	    for (int i = 0; i < 3; i++) {
		printStudent(students[i]);
	    }

	    return EXIT_SUCCESS;
}


