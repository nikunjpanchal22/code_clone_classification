def is_continuous(seq) :
	non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
	for i, index in enumerate(non_null_indices [: - 1]) :
		if non_null_indices [i + 1] - index > 1 :
			return False
	return True



def is_continuous(seq):
    non_null_indices = []
    for i, obj in enumerate(seq):
        if obj is not None:
            non_null_indices.append(i)
    i = 0
    while i < len(non_null_indices) - 1:
        if non_null_indices[i + 1] - non_null_indices[i] > 1:
            return False
        i += 1
    return True




