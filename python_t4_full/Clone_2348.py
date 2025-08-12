def is_continuous(seq) :
	non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
	for i, index in enumerate(non_null_indices [: - 1]) :
		if non_null_indices [i + 1] - index > 1 :
			return False
	return True


 def is_continuous(seq):
    start_index = end_index = -1
    for i in range(len(seq)):
        if seq[i] is not None:
            if start_index == -1:
                start_index = i
            end_index = i
        else:
            if start_index != -1 and i - end_index > 1:
                return False
            start_index = -1
    return True


