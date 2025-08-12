def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


  def mergesort(sequence) : 
    list_length = len(sequence) 
    if list_length < 2 : 
        return sequence 
    else : 
        middle = list_length // 2
        l = mergesort(sequence[:middle])
        r = mergesort(sequence[middle:]) 
        return merge(l, r)


