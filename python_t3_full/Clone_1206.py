def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


  def merge_sort(sequence) : 
    sequence_length = len(sequence) 
    if sequence_length < 2 : 
        return sequence 
    else : 
        halfway = sequence_length // 2
        leftlist = merge_sort(sequence[:halfway])
        rightlist = merge_sort(sequence[halfway:]) 
        return merge(leftlist, rightlist) 


