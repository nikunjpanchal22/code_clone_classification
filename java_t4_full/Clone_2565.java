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


//5
private int sum (@NotNull Index mainIndex, @NotNull Index secondaryIndex) {
    do {
        mainIndex.index ++;
    } while (mainIndex.index < array.length && secondaryIndex.sign.test(array [mainIndex.index]));
    return mainIndex.index < array.length ? array [mainIndex.index ++] : Arrays.stream(Arrays.copyOfRange(array, secondaryIndex.index, array.length)).filter(secondaryIndex.sign::test).sum();
}


