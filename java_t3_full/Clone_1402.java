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

    Comparable[] minArray;
    Comparable[] maxArray;

    if (arr1.length <= arr2.length && arr1.length <= arr3.length) {
        minArray = arr1;
        maxArray = ArrayUtils.addAll(arr2, arr3);
    } else if (arr2.length <= arr1.length && arr2.length <= arr3.length) {
        minArray = arr2;
        maxArray = ArrayUtils.addAll(arr1, arr3);
    } else {
        minArray = arr3;
        maxArray = ArrayUtils.addAll(arr2, arr1);
    }

    List<Comparable> resultList = new ArrayList<>();

    for (Comparable small : minArray) {
        for (Comparable large : maxArray) {
            if (small.equals(large)) {
                resultList.add(small);
            }
        }
    }

    return resultList.toArray(new Comparable[0]);
}


