private static void note () {
    int [] i = new int [1];
    do
        {
            Console.WriteLine ("Please enter test result");
            bool result = int.TryParse (Console.ReadLine (), out i [0]);
            if (! result) {
                Console.WriteLine ("Please enter a number");
                continue;
            }
            if (i [0] == 999) {
                Console.WriteLine ("You entered 999 to stop");
                break;
            } else if (i [0] < 0 || i [0] > 100) {
                Console.WriteLine ("Enter a value between 0 and 100");
            } else if (i [0] >= 90) {
                Console.WriteLine ("note is A");
            } else if (i [0] >= 80) {
                Console.WriteLine ("note is B");
            } else if (i [0] >= 70) {
                Console.WriteLine ("note is C");
            } else if (i [0] >= 60) {
                Console.WriteLine ("note is D");
            } else if (i [0] < 60) {
                Console.WriteLine ("Failure");
            }
            Console.WriteLine ("Your result is:" + i [0]);
        } while (true);
}


 private static void note () {
    int [] i = new int [1];
    while (true) 
        {
            Console.WriteLine ("Please enter test result");
            bool result = int.TryParse (Console.ReadLine (), out i [0]);
            if (! result) {
                Console.WriteLine ("Please enter a number");
                continue;
            }
            if (i [0] == 999) {
                Console.WriteLine ("You entered 999 to stop");
                break;
            } else if (i [0] < 0 || i [0] > 100) {
                Console.WriteLine ("Enter a value between 0 and 100");
            } else {
                if (i [0] >= 90) {
                    Console.Write ("note is A : You Got ");
                    switch (i [0]) {
                        case 90:
                            Console.WriteLine ("Almost Perfect");
                            break;
                        case 91: 
                            Console.WriteLine ("Very Good");
                            break;
                        case 92:
                            Console.WriteLine ("Impressive");
                            break;
                        case 93:
                            Console.WriteLine ("Good Job");
                            break;
                        case 94:
                            Console.WriteLine ("Excellent");
                            break;
                        case 95:
                            Console.WriteLine ("Amazing");
                            break;
                        case 96:
                            Console.WriteLine ("Outstanding");
                            break;
                        case 97:
                            Console.WriteLine ("Great Work!");
                            break;
                        case 98:
                            Console.WriteLine ("Fantastic!");
                            break;
                        case 99:
                            Console.WriteLine ("Wonderful");
                            break;
                        case 100: 
                            Console.WriteLine ("Perfect");
                            break;
                        default:
                            break;
                    }
                    
                } else if (i [0] >= 80) {
                    Console.Write ("note is B : You Got ");
                    switch (i [0]) {
                        case 80:
                            Console.WriteLine ("Very good");
                            break;
                        case 81: 
                            Console.WriteLine ("Good");
                            break;
                        case 82:
                            Console.WriteLine ("Improved");
                            break;
                        case 83:
                            Console.WriteLine ("Well done");
                            break;
                        case 84:
                            Console.WriteLine ("Solid");
                            break;
                        case 85:
                            Console.WriteLine ("Adequate");
                            break;
                        case 86:
                            Console.WriteLine ("Good effort");
                            break;
                        case 87:
                            Console.WriteLine ("Passable");
                            break;
                        case 88:
                            Console.WriteLine ("Acceptable");
                            break;
                        case 89: 
                            Console.WriteLine ("Impressive");
                            break;
                        default:
                            break;
                    }
                } else if (i [0] >= 70) {
                    Console.Write ("note is C : You Got ");
                    switch (i [0]) {
                        case 70:
                            Console.WriteLine (" Improvement needed");
                            break;
                        case 71: 
                            Console.WriteLine ("Mediocre");
                            break;
                        case 72:
                            Console.WriteLine ("Below Average");
                            break;
                        case 73:
                            Console.WriteLine ("Average");
                            break;
                        case 74:
                            Console.WriteLine ("Reasonable");
                            break;
                        case 75:
                            Console.WriteLine ("Adequate");
                            break;
                        case 76:
                            Console.WriteLine ("Default");
                            break;
                        case 77:
                            Console.WriteLine ("Satisfactory");
                            break;
                        case 78:
                            Console.WriteLine ("Notable");
                            break;
                        case 79: 
                            Console.WriteLine ("Moderate");
                            break;
                        default:
                            break;
                    }
                } else if (i [0] >= 60) {
                    Console.Write ("note is D : You Got ");
                    switch (i [0]) {
                        case 60:
                            Console.WriteLine ("Unsatisfactory");
                            break;
                        case 61: 
                            Console.WriteLine ("Poor");
                            break;
                        case 62:
                            Console.WriteLine ("Sub-optimal");
                            break;
                        case 63:
                            Console.WriteLine ("Below Standard");
                            break;
                        case 64:
                            Console.WriteLine ("Just Enough");
                            break;
                        case 65:
                            Console.WriteLine ("Deficient");
                            break;
                        case 66:
                            Console.WriteLine ("Lowest");
                            break;
                        case 67:
                            Console.WriteLine ("Insignificant");
                            break;
                        case 68:
                            Console.WriteLine ("Pitiable");
                            break;
                        case 69: 
                            Console.WriteLine ("At Risk");
                            break;
                        default:
                            break;
                    }
                } else {
                    Console.WriteLine ("Failure");
                }
                Console.WriteLine ("Your result is:" + i [0]);
            }
        }
}


