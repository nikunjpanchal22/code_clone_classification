public static void main (String [] args) {
    System.out.println ("Hello World");
    String xyz = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final int mid = (xyz.length () + 1) / 2;
    String [] spstr = {xyz.substring (0, mid), xyz.substring (mid)};
    String firstMix = spstr [1] + spstr [0];
    String [] array = firstMix.split ("");
    for (int i = 1;
    i < 3; i ++) {
        String temp = array [i];
        array [i] = array [array.length - i];
        array [array.length - i] = temp;
    }
    String str1 = Arrays.toString (array);
    str1 = str1.substring (1, str1.length () - 1).replaceAll (",", "");
    int j = 2;
    for (int i = ((array.length / 2) - 2);
    i < (array.length) / 2; i ++) {
        String temp = array [i];
        array [i] = array [array.length / 2 + j];
        array [array.length / 2 + j] = temp;
        j --;
    }
    String str2 = Arrays.toString (array);
    str2 = str2.substring (1, str2.length () - 1).replaceAll (",", "");
    System.out.println (firstMix);
    System.out.println (str1);
    System.out.println (str2);
}


 public static void main (String [] args){
    System.out.println("Hello World!"); 
    String allLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    int mid = (allLetters.length()+1)/2; 
    String[] separatedString = {allLetters.substring(0,mid), allLetters.substring(mid)}; 
    String firstMix = separatedString[1]+separatedString[0]; 
    String[] array = firstMix.split(""); 
    for (int i=1;i<3;i++){
        String temp=array[i]; 
        array[i]=array[array.length-i]; 
        array[array.length-i]=temp;
    } 
    String makeOne = Arrays.toString(array); 
    makeOne=makeOne.substring(1,makeOne.length()-1).replaceAll(",",""); 
    int y=2; 
    for (int i=(array.length/2-2);i<array.length/2;i++){
        String temp=array[i]; 
        array[i]=array[array.length/2+y]; 
        array[array.length/2+y]=temp; 
        y--; 
    }
    String makeTwo = Arrays.toString(array); 
    makeTwo=makeTwo.substring(1,makeTwo.length()-1).replaceAll(",",""); 
    System.out.println(firstMix); 
    System.out.println(makeOne); 
    System.out.println(makeTwo); 
}
