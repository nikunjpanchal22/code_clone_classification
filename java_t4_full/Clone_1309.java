public static Comparable [] findCommonElements (Comparable [] [] collections) {
    Comparable [] arr1 = collections [0];
    Comparable [] arr2 = collections [1];
    Comparable [] arr3 = collections [2];
    if (arr1.length < arr2.length && arr1.length < arr3.length || arr2.length <= arr3.length) {
        hashArray = arr1;
        queryArray = ArrayUtils.addAll (arr2, arr3);
    } else if (arr2.length < arr1.length && arr2.length < arr3.length || arr1.length <= arr3.length) {
        hashArray = arr2;
        queryArray = ArrayUtils.addAll (arr1, arr3);
    } else if (arr3.length < arr1.length && arr3.length < arr2.length || arr1.length <= arr2.length) {
        hashArray = arr3;
        queryArray = ArrayUtils.addAll (arr1, arr2);
    }
    HashSet < Comparable > intersectionSet = new HashSet < > ();
    HashSet < Comparable > arrayToHash = new HashSet < > ();
    for (Comparable element : hashArray) {
        arrayToHash.add (element);
    }
    for (Comparable element : queryArray) {
        if (element != null) {
            comparisons ++;
        }
        if (arrayToHash.contains (element)) {
            intersectionSet.add (element);
        }
    }
    return intersectionSet.toArray (new Comparable [0]);
}


 public static Comparable[] findCommonElements(Comparable[][] collections) {
    Comparable[] arr1 = collections[0];
    Comparable[] arr2 = collections[1];
    Comparable[] arr3 = collections[2];

    Comparable[] x;
    Comparable[] y;
    Comparable[] z;
    if (arr1.length <= arr2.length && arr1.length <= arr3.length) {
        x = arr1;
        y = arr2;
        z = arr3;
    } else if (arr2.length <= arr1.length && arr2.length <= arr3.length) {
        x = arr2;
        y = arr1;
        z = arr3;
    } else {
        x = arr3;
        y = arr1;
        z = arr2;
    }

    HashSet<Comparable> resultSet = new HashSet<>();

    for (int i = 0; i < x.length; i++) {
        Comparable e = x[i];
        for (int j = 0; j < y.length; j++) {
            if (e.equals(y[j])) {
                for (int k = 0; k < z.length; k++) {
                    if (e.equals(z[k])) {
                        resultSet.add(e);
                        break;
                    }
                }
            }
        }
    }

    return resultSet.toArray(new Comparable[0]);
}


