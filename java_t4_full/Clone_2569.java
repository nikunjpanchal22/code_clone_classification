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


//3
private int sum (@NotNull Index mainIndex, @NotNull Index secondaryIndex) {
    while(mainIndex.index < array.length && secondaryIndex.sign.test(array[mainIndex.index])) mainIndex.index++;
    if(mainIndex.index < array.length) return array[mainIndex.index++];
    return Arrays.stream(Arrays.copyOfRange(array, secondaryIndex.index, array.length)).filter(secondaryIndex.sign::test).sum();
}


