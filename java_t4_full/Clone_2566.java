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


//6
private int sum (@NotNull Index main, @NotNull Index second) {
    for (; main.index < array.length && second.sign.test(array[main.index]); main.index++);
    if (main.index < array.length) 
        return array [main.index ++];
    return Arrays.stream(array, second.index, array.length).filter(second.sign::test).sum();
}


