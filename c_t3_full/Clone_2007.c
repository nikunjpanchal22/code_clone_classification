int main (void) {
    int i, number, guess, ret;
    char answer;
    printf ("Welcome to the game of Guess It!\n" "I will choose a number between %d and %d.\n" "You will try to guess that number.\n" "I will tell you if you guessed too high or too low.\n" "You have %d tries to get the number.\n\n" "OK, I am thinking of a number. Try to guess it.\n\n", LOW, HIGH, TRIES);
    srand (time (NULL));
    while (1) {
        number = rand () % HIGH + 1;
        for (i = 0; i < TRIES; i++) {
            while (1) {
                printf ("Your guess no. %d? ", i + 1);
                if ((ret = scanf (" %d", &guess)) != 1) {
                    if (ret == EOF) {
                        printf ("input canceled, exiting.\n");
                        return 0;
                    }
                    fprintf (stderr, "  error: invalid input.\n");
                    fflushstdin ();
                    continue;
                }
                if (guess < LOW || guess > HIGH)
                    printf ("Illegal guess. Your guess must be between " "%d and %d.\nTry again. Your guess?", LOW, HIGH);
                break;
            }
            if (guess == number) {
                printf ("\n**** CORRECT  ****\n\nWant to play again(y/n) ");
                fflushstdin ();
                while ((ret = scanf (" %c", &answer)) != 1 || (answer != 'y' && answer != 'n')) {
                    fprintf (stderr, "error: invalid answer, play again (y/n) ");
                    if (ret == EOF) {
                        printf ("input canceled, exiting.\n");
                        return 0;
                    }
                    fflushstdin ();
                }
                if (answer == 'y')
                    goto done;
                printf ("Goodbye, It was fun. Play again soon.\n");
                return 0;
            }
            if (guess > number)
                printf ("Too high!\n");
            if (guess < number)
                printf ("Too low!\n");
        }
        printf ("Sorry, you exhausted all your tries, number was: %d\n" "play again (y/n) ", number);
        fflushstdin ();
        while ((ret = scanf (" %c", &answer)) != 1 || (answer != 'y' && answer != 'n')) {
            fprintf (stderr, "error: invalid answer, play again (y/n) ");
            if (ret == EOF) {
                printf ("input canceled, exiting.\n");
                return 0;
            }
            fflushstdin ();
        }
        if (answer != 'y')
            break;
    done :
        ;
    }
    return 0;
}





#define LOW 1
#define HIGH 100
#define TRIES 10

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int guessedNumber, numbers, guess, returnValue;
    char ans;

    printf("Welcome to the game!\nI will choose a number between %d and %d\nYou will try guess that number.\n", LOW, HIGH);
    srand(time(NULL));

    while (1) {
        numbers = rand() % HIGH + 1;
        for (guessedNumber = 0; guessedNumber < TRIES; guessedNumber++) {
            while(1) {
                printf("Your guess no. %d? ", guessedNumber + 1);
                if ((returnValue = scanf(" %d", &guess)) != 1) {
                    if (returnValue == EOF) {
                        printf("input cancelled, exiting\n");
                        return 0;
                    }
                    fprintf(stderr, "  Error: invalid input.\n");
                    continue;
                }
                if (guess < LOW || guess > HIGH)
                    printf("Illegal guess. Your guess must be between %d and %d.\nTry again. Your guess? ", LOW, HIGH);
                else
                    break;
            }
            if (guess == numbers) {
                printf("\n**** CORRECT  ****\n\nWould you like play again (y/n)? ");
                while ((returnValue = scanf(" %c", &ans)) != 1 || (ans != 'y' && ans != 'n')) {
                    fprintf(stderr, "  error: invalid answer, play again (y/n) ");
                    if (returnValue == EOF) {
                        printf("input cancelled, exiting\n");
                        return 0;
                    }
                }
                if (ans != 'y')
                    return 0;
                else
                    break;
            }
            if (guess > numbers)
                printf("Too high!\n");
            if (guess < numbers)
                printf("Too low!\n");
        }
        if (guessedNumber == TRIES)
            printf("Sorry, you have exhausted your tries, the correct number was: %d\n", numbers);
        printf("Would you like to play again (y/n)? ");
        while ((returnValue = scanf(" %c", &ans)) != 1 || (ans != 'y' && ans != 'n')) {
            fprintf(stderr, "  error: invalid answer, play again (y/n) ");
            if (returnValue == EOF) {
                printf("input cancelled, exiting\n");
                return 0;
            }
        }
        if (ans != 'y')
            return 0;
    }
    return 0;
}


