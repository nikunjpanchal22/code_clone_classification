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


private int sum (@NotNull
Index mainIndex,@NotNull
Index secondaryIndex) {
    int localSum = 0;
    while (secondaryIndex.index < array.length && secondaryIndex.sign.test (array [secondaryIndex.index])) {
        secondaryIndex.index ++;
    }
    if (secondaryIndex.index < array.length) {
        localSum += array [secondaryIndex.index ++];
    } else {
        for (; mainIndex.index < array.length; mainIndex.index ++) {
            if (mainIndex.sign.test (array [mainIndex.index])) {
                localSum += array [mainIndex.index];
            }
        }
    }
    return localSum;
}
