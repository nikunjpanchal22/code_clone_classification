def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


  def merge_sort(sequence) : 
    list_length = len(sequence) 
    if list_length < 2 : 
        return sequence 
    else : 
        midpoint = list_length // 2
        leftside = merge_sort(sequence[:midpoint])
        rightside = merge_sort(sequence[midpoint:]) 
        return merge(leftside, rightside)


