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


//4
private int sum (@NotNull Index primaryIndex, @NotNull Index secondaryIndex) {
    int sum = 0;
    while(primaryIndex.index < array.length && secondaryIndex.sign.test(array[primaryIndex.index])) primaryIndex.index++;
    if(primaryIndex.index < array.length) return array[primaryIndex.index++];
    for (; secondaryIndex.index < array.length; secondaryIndex.index++) 
        if(secondaryIndex.sign.test(array[secondaryIndex.index])) sum += array[secondaryIndex.index];
    return sum;
}


