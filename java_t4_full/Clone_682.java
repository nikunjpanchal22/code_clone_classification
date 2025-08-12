public static void main (String [] args) {
    double [] [] data = {{97, 36, 79}, {94, 74, 60}, {68, 76, 58}, {64, 87, 56}, {68, 27, 73}, {74, 99, 42}, {7, 93, 87}, {51, 69, 40}, {38, 23, 33}, {57, 86, 31}};
    double data1 [] = new double [data.length];
    double data2 [] = new double [data.length];
    double data3 [] = new double [data.length];
    for (int x = 0;
    x < data.length; x ++) {
        for (int y = 0;
        y < data [x].length; y ++) {
            if (y == 0) data1 [x] = data [x] [y];
            else if (y == 1) data2 [x] = data [x] [y];
            else if (y == 2) data3 [x] = data [x] [y];
        }
    }
    for (int i = 0;
    i < data1.length; i ++) {
        System.out.print (data1 [i] + " ");
        System.out.print (data2 [i] + " ");
        System.out.print (data3 [i] + " ");
        System.out.println ();
    }
}


 public static void main (String [] args) { 
        double [] [] data = {{97, 36, 79}, {94, 74, 60}, {68, 76, 58}, {64, 87, 56}, {68, 27, 73}, {74, 99, 42}, {7, 93, 87}, {51, 69, 40}, {38, 23, 33}, {57, 86, 31}};
        int row = data.length;
        int col = data[0].length;
        double data1[] = new double[data.length];
        double data2[] = new double[data.length];
        double data3[] = new double[data.length];
        double temp;
       
        for (int i=0;i<row;i++) {
            data1[i] = data[i][0];
            data2[i] = data[i][1];
            data3[i] = data[i][2];
        }
       
        for (int i=0;i<row;i++) {
            for (int j=0;j<col-1;j++) {
                if (data1[i]>data2[i]) {
                    temp=data1[i];
                    data1[i]=data2[i];
                    data2[i]=temp;
                }
           
                if (data2[i]>data3[i]) {
                    temp=data2[i];
                    data2[i]=data3[i];
                    data3[i]=temp;
                }
            }
        }
       
        for (int i=0;i<row;i++) {
            System.out.print(data1[i]+" ");
            System.out.print(data2[i]+" ");
            System.out.print(data3[i]+" ");
            System.out.println();
        }
}


