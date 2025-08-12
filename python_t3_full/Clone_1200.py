def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


  def mergesort(sequence) : 
    listlen = len(sequence) 
    if listlen < 2: 
        return sequence 
    else : 
        mid = listlen // 2
        left = merge_sort(sequence[:mid])
        right = merge_sort(sequence[mid:]) 
        return merge(left, right)


