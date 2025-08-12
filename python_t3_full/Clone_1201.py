def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


  def merge_sort(sequence) : 
    seq_len = len(sequence) 
    if seq_len < 2 : 
        return sequence 
    else : 
        middle = seq_len // 2
        l = merge_sort(sequence[:middle])
        r = merge_sort(sequence[middle:]) 
        return merge(l, r) 


