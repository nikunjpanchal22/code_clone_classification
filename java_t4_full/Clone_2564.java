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




//1
private int sum (@NotNull Index mainIndex, @NotNull Index secondaryIndex) {
    for(; mainIndex.index < array.length && secondaryIndex.sign.test(array[mainIndex.index]); mainIndex.index++);
    if(mainIndex.index < array.length) return array[mainIndex.index++];
    int result = 0;
    for(; secondaryIndex.index < array.length; secondaryIndex.index++) 
        if(secondaryIndex.sign.test(array[secondaryIndex.index])) result+= array[secondaryIndex.index];
    return result;
}


