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

void getUserData(float *weight, float *height) {
		    printf("Your weight please: ");
		    scanf("%f", weight);
		    printf("Next, your height please: ");
		    scanf("%f", height);
		}

		char *getBMI(int USERS, float *weight, float *height) {
		    char *status[] = {"Underweight", "Healthy", "Overweight"};
		    float thresholds[THRESHOLDS] = {18.5, 25.0};
		    int i;
		    for(i = 0; i < USERS; i++) {
			float BMI = weight[i] / (height[i] * height[i]);
			int j;
			for(j = 0; j < THRESHOLDS; j++) {
			    if(BMI < thresholds[j]) break;
			}
			printf("BMI: %.2f - %s\n", BMI, status[j]);
		    }
		}

		int main(void) {
		    float weight[USERS], height[USERS];
		    for(int i = 0; i < USERS; i++) {
			getUserData(&weight[i], &height[i]);
		    }
		    getBMI(USERS, weight, height);
		    return 0;
}


