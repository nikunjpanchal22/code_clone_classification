public static void main (String [] args) {
    int temp = 0;
    out : for (int i = 0;
    i < 3; ++ i) {
        System.out.println ("I am here");
        for (int j = 0;
        j < 20; ++ j) {
            if (temp == 0) {
                System.out.println ("j: " + j);
                if (j == 1) {
                    temp = j;
                    continue out;
                }
            }
        }
    }
    System.out.println ("temp = " + temp);
}





public static void main(String[] args) {
    int temp = 0;
    outer: for(int i = 0; i < 3; i++){
        System.out.println("I am here");
        for(int f = 0; f < 20; f++){
            System.out.println("j: " + f);
            if(f == 1){
                temp = f;
                break outer;
            }
        }
    }
    System.out.println("Temp = " + temp);
}

