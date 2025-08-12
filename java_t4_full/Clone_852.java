public static void main (String [] args) {
    System.out.println ("Enter Number to convert into words");
    Scanner sc = new Scanner (System.in);
    long num = sc.nextInt ();
    int rem = 0;
    int i = 0;
    while (num > 0) {
        if (i == 0) {
            rem = (int) (num % 1000);
            printText (rem);
            num = num / 1000;
            i ++;
        } else if (num > 0) {
            rem = (int) (num % 100);
            if (rem > 0) text = denom.values () [i - 1] + " " + text;
            printText (rem);
            num = num / 100;
            i ++;
        }
    }
    if (i > 0) System.out.println (text);
    else System.out.println ("Zero");
}


 public static void main (String [] args) { 
    System.out.println ("Enter a number to convert into words");  
    Scanner sc = new Scanner (System.in);  
    int number = sc.nextInt ();  
    int rem = 0;  
    int n = number;  
    int count = 0;  
    String convertedText = "";  
  
    while (n != 0) {  
        rem = n % 10;  
        switch (count) {  
            case 0:  
                switch (rem) {  
                    case 1:  
                        convertedText = "One " + convertedText;  
                        break;  
                    case 2:  
                        convertedText = "Two " + convertedText;  
                        break;  
                    case 3:  
                        convertedText = "Three " + convertedText;  
                        break;  
                    case 4:  
                        convertedText = "Four " + convertedText;  
                        break;  
                    case 5:  
                        convertedText = "Five " + convertedText;  
                        break;  
                    case 6:  
                        convertedText = "Six " + convertedText;  
                        break;  
                    case 7:  
                        convertedText = "Seven " + convertedText;  
                        break;  
                    case 8:  
                        convertedText = "Eight " + convertedText;  
                        break;  
                    case 9:  
                        convertedText = "Nine " + convertedText;  
                        break;  
                }  
                break;  
            case 1:  
                switch (rem) {  
                    case 1:  
                        convertedText = "Ten " + convertedText;  
                        break;  
                    case 2:  
                        convertedText = "Twenty " + convertedText;  
                        break;  
                    case 3:  
                        convertedText = "Thirty " + convertedText;  
                        break;  
                    case 4:  
                        convertedText = "Forty " + convertedText;  
                        break;  
                    case 5:  
                        convertedText = "Fifty " + convertedText;  
                        break;  
                    case 6:  
                        convertedText = "Sixty " + convertedText;  
                        break;  
                    case 7:  
                        convertedText = "Seventy " + convertedText;  
                        break;  
                    case 8:  
                        convertedText = "Eighty " + convertedText;  
                        break;  
                    case 9:  
                        convertedText = "Ninety " + convertedText;  
                        break;  
                }  
                break;  
            case 2:  
                switch (rem) {  
                    case 1:  
                        convertedText = "One Hundred " + convertedText;  
                        break;  
                    case 2:  
                        convertedText = "Two Hundred " + convertedText;  
                        break;  
                    case 3:  
                        convertedText = "Three Hundred " + convertedText;  
                        break;  
                    case 4:  
                        convertedText = "Four Hundred " + convertedText;  
                        break;  
                    case 5:  
                        convertedText = "Five Hundred " + convertedText;  
                        break;  
                    case 6:  
                        convertedText = "Six Hundred " + convertedText;  
                        break;  
                    case 7:  
                        convertedText = "Seven Hundred " + convertedText;  
                        break;  
                    case 8:  
                        convertedText = "Eight Hundred " + convertedText;  
                        break;  
                    case 9:  
                        convertedText = "Nine Hundred " + convertedText;  
                        break;  
                }  
                break;  
        }  
        n = n / 10;  
        count++;  
    }  
    if (number == 0)  
        System.out.println ("Zero");  
    else  
        System.out.println (convertedText);  
}


