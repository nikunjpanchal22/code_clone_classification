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


//9
private int sum (@NotNull Index mainIndex, @NotNull Index secondaryIndex) {
    for(; mainIndex.index < array.length && secondaryIndex.sign.test(array[mainIndex.index]); mainIndex.index++);
    return mainIndex.index < array.length ? array[mainIndex.index++] :
            IntStream.range(secondaryIndex.index, array.length).filter(i -> secondaryIndex.sign.test(array[i])).sum();
}


