def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


 def merge_sort(sequence): 
    if sequence is None: 
        return None
    if len(sequence) < 2 : 
        return sequence
    midIndex = len(sequence)//2  
    leftSubArray = sequence[:midIndex] 
    rightSubArray = sequence[midIndex:]  
    if len(leftSubArray) > 1: 
        leftSubArray = merge_sort(leftSubArray) 
    if len(rightSubArray) > 1: 
        rightSubArray = merge_sort(rightSubArray)
    return combineArray(leftSubArray, rightSubArray)


