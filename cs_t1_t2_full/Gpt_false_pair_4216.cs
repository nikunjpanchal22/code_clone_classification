public static int convertNum (String n1, String n2) {
    int num1 = 0;
    int num2 = 0;
    int result = 0;
    try {
        num1 = Int32.Parse (n1);
        num2 = Int32.Parse (n2);
        result = sum (num1, num2);
        return result;
    }
    catch (FormatException) {
        MessageBox.Show ("Input only numbers.");
        return result;
    }
}


public static int convertNum (string n1, string n2) {
    int num1 = 0;
    int num2 = 0;
    int result = 0;

    try {
        num1 = Int32.Parse (n1);
        num2 = Int32.Parse (n2);
        result = multiply (num1, num2); 
        return result;
    } catch (FormatException) {
        MessageBox.Show ("Input only numbers.");
        return result;
    }
}
