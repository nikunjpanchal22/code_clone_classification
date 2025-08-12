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
#define THRESHOLDS 3

void printBMI(int i, float BMI, char **BMI_Status, int j);

int main() {
		    float *weight = malloc(sizeof(float) * USERS), *height = malloc(sizeof(float) * USERS), BMI;
		    char *BMI_Status[THRESHOLDS + 1] = {"Underweight", "Normal", "Overweight", "Obese"};
		    float thresholds[THRESHOLDS] = {10.0, 20.0, 30.0};
		    int i, j;
		    for (i = 0; i < USERS; i++) {
			printf("Enter your weight: ");
			scanf("%f", &(weight[i]));
			printf("Enter your height: ");
			scanf("%f", &(height[i]));
		    }
		    for (i = 0; i < USERS; i++) {
			BMI = weight[i] / (height[i] * height[i]);
			for (j = 0; j < THRESHOLDS; j++) {
			    if (BMI < thresholds[j]) {
				break;
			    }
			}
			printBMI(i, BMI, BMI_Status, j);
		    }
		    free(weight);
		    free(height);
		    return 0;
		}

		void printBMI(int i, float BMI, char **BMI_Status, int j) {
		    printf("%d -> BMI: %f - %s\n", i, BMI, BMI_Status[j]);
}


