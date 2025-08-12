int main (void) {
    float weight [USERS];
    float height [USERS];
    float BMI = 0.0f;
    char *BMI_Status [THRESHOLDS + 1] = {"Normal", "Overweight", "Obese"};
    float thresholds [THRESHOLDS] = {10.0, 20.0};
    int i, j;
    for (i = 0; i < USERS; i++) {
        printf ("Please enter your weight: ");
        scanf ("%f", & (weight [i]));
        printf ("Now enter your height: ");
        scanf ("%f", & (height [i]));
    }
    for (i = 0; i < USERS; i++) {
        BMI = weight[i] / (height[i] * height[i]);
        printf ("%d\t%f\t", i, BMI);
        for (j = 0; j < THRESHOLDS; j++) {
            if (BMI < thresholds[j]) {
                break;
            }
        }
        printf ("%s\n", BMI_Status [j]);
    }
    return 0;
}





#include <stdio.h>

#define USERS 3
#define THRESHOLDS 2

void getUserData(float*, float*);
void printBMI(float, float);
char *getStatus(float);

int main(void) {
	    float weight[USERS], height[USERS];
	    for(int i = 0; i < USERS; i++) {
		getUserData(&weight[i], &height[i]);
		printBMI(weight[i], height[i]);
	    }
	    return 0;
	}

	void getUserData(float *weight, float *height) {
	    printf("Enter weight: ");
	    scanf("%f", weight);
	    printf("Enter height: ");
	    scanf("%f", height);
	}

	void printBMI(float weight, float height) {
	    float BMI = weight / (height * height);
	    printf("BMI: %.2f\n", BMI);
	    printf("Status: %s\n", getStatus(BMI));
	}

	char *getStatus(float BMI) {
	    float thresholds[THRESHOLDS] = {18.5, 25.0};
	    char *status[] = {"Underweight", "Normal", "Overweight"};
	    int i;
	    for(i = 0; i < THRESHOLDS; i++) {
		if(BMI < thresholds[i]) break;
	    }
	    return status[i];
}


