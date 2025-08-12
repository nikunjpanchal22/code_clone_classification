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

    HashSet<Comparable> hashSet = new HashSet<>();
    hashSet.addAll(Arrays.asList(arr1));

    List<Comparable> resultList = new ArrayList<>();
    for (Comparable c : arr2) {
        if (hashSet.contains(c)) {
            resultList.add(c);
            hashSet.remove(c);
        }
    }

    for (Comparable c : arr3) {
        if (hashSet.contains(c)) {
            if (!resultList.contains(c)) {
                resultList.add(c);
                hashSet.remove(c);
            }
        }
    }

    return resultList.toArray(new Comparable[0]);
}


