private int sum (@NotNull
Index mainIndex,@NotNull
Index secondaryIndex) {
    int localSum = 0;
    while (mainIndex.index < array.length && secondaryIndex.sign.test (array [mainIndex.index])) {
        mainIndex.index ++;
    }
    if (mainIndex.index < array.length) {
        localSum += array [mainIndex.index ++];
    } else {
        for (; secondaryIndex.index < array.length; secondaryIndex.index ++) {
            if (secondaryIndex.sign.test (array [secondaryIndex.index])) {
                localSum += array [secondaryIndex.index];
            }
        }
    }
    return localSum;
}


//7
private int sum (@NotNull Index primary, @NotNull Index secondary) {
    while (primary.index < array.length && secondary.sign.test (array[primary.index])) primary.index ++;
    if (primary.index >= array.length)
        return Arrays.stream(array, secondary.index, array.length).filter(secondary.sign::test).sum();
    return array [primary.index ++];
}


