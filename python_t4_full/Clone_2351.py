def is_continuous(seq) :
	non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
	for i, index in enumerate(non_null_indices [: - 1]) :
		if non_null_indices [i + 1] - index > 1 :
			return False
	return True


 def is_continuous(seq):
    start_index = end_index = None
    for i in range(len(seq)):
        if seq[i] is not None:
            if start_index is None:
                start_index = i
            else:
                end_index = i
        elif start_index is not None and end_index is not None:
            if i - end_index > 1:
                return False
    
    return True


