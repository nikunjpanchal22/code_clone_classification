public void printSquare (int min, int max) {
    for (int i = min;
    i <= max; i ++) {
        for (int j = i;
        j <= max; j ++) {
            System.out.print (j);
        }
        for (int k = min;
        k < i; k ++) {
            System.out.print (k);
        }
        System.out.println ();
    }
}




public void printSquare(int min, int max) {
    for (Integer i = min; i <= max; i++) {
        System.out.println(
                Stream.concat(
                        i.toString().chars().boxed().skip(min).limit(max - min + 1), 
                        i.toString().chars().boxed().skip(max + 1).limit(i - max)
                ).map(Character::getNumericValue)
                     .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                     .toString()
        );
    }
}


