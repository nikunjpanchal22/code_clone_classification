public static void main (String [] args) {
    int [] nums = new int [N];
    for (int i = 0;
    i < nums.length; ++ i) {
        nums [i] = i;
    }
    Random randomGenerator = new Random ();
    int randomIndex;
    int randomValue;
    for (int i = 0;
    i < nums.length; ++ i) {
        randomIndex = randomGenerator.nextInt (nums.length);
        randomValue = nums [randomIndex];
        nums [randomIndex] = nums [i];
        nums [i] = randomValue;
    }
}





public static void main(String[] args) {
    int[] variable = new int[N];
    for (int j = 0; j < variable.length; ++j)
        variable[j] = j;
    Random random_process = new Random();
    int random_id, random_item;
    for (int j = 0; j < variable.length; ++j) {
        random_id = random_process.nextInt(variable.length);
        random_item = variable[random_id];
        variable[random_id] = variable[j];
        variable[j] = random_item;
    }
}


