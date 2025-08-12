public IEnumerable < int [] > GetIntPermutations (int [] index, int offset, int len) {
    switch (len) {
        case 1 :
            yield return index;
            break;
        case 2 :
            yield return index;
            Swap (index, offset, offset + 1);
            yield return index;
            Swap (index, offset, offset + 1);
            break;
        default :
            foreach (var result in GetIntPermutations (index, offset + 1, len - 1)) {
                yield return result;
            }
            for (var i = 1; i < len; i ++) {
                Swap (index, offset, offset + i);
                foreach (var result in GetIntPermutations (index, offset + 1, len - 1)) {
                    yield return result;
                }
                Swap (index, offset, offset + i);
            }
            break;
    }
}


 
public IEnumerable < int [] > GetIntPermutations (int [] index, int offset, int len)
{
    // If the length is 1, just return the index
    if(len == 1){
        yield return index;
    }
    else if(len == 2){
        // Return the original index
        yield return index;
        
        // Swap the elements in index and return the resulting index
        Swap (index, offset, offset + 1);
        yield return index;
        
        // Swap the elements back
        Swap (index, offset, offset + 1);
    }
    else{
        for(int i = 0; i < len; i++){
            // For length greater than two, go through the array and swap elements at each iteration
            Swap(index, offset, offset + i);
            foreach(int[] tempIndex in GetIntPermutations(index, offset + 1, len - 1)){
                yield return tempIndex;
            }
            Swap(index, offset, offset + i);
        }
    }
}


