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

char *bmi_classification(float bmi) {
		    if (bmi < 18.5) {
			return "Underweight";
		    } else if (bmi >= 18.5 && bmi < 25) {
			return "Normal";
		    } else if (bmi >= 25 && bmi < 30) {
			return "Overweight";
		    } else {
			return "Obese";
		    }
		}

		int main(void) {
		    float weights[USERS], heights[USERS], bmi;
		    for (int i = 0; i < USERS; i++) {
			printf("Enter your weight (kg): ");
			scanf("%f", &weights[i]);
			printf("Enter your height (m): ");
			scanf("%f", &heights[i]);
			bmi = weights[i] / (heights[i] * heights[i]);
			printf("%d -> BMI: %.2f, Status: %s\n", i + 1, bmi, bmi_classification(bmi));
		    }
		    return 0;
}


