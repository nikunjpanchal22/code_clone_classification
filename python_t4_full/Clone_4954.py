def is_continuous(seq) :
	non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
	for i, index in enumerate(non_null_indices [: - 1]) :
		if non_null_indices [i + 1] - index > 1 :
			return False
	return True



def is_continuous(seq):
    indices = list(map(lambda x: x[0],
                       filter(lambda x: x[1] is not None, enumerate(seq))))
    return all(indices[i+1] - indices[i] == 1 for i in range(len(indices) - 1))




