def is_continuous(seq) :
	non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
	for i, index in enumerate(non_null_indices [: - 1]) :
		if non_null_indices [i + 1] - index > 1 :
			return False
	return True


 def is_continuous(seq):
    count = 0
    for i in range(len(seq)):
        if seq[i] is None:
            count += 1
    if count == 0:
        return True
    for i in range(1, len(seq)):
        if seq[i] is not None and seq[i-1] is not None and i+1 != len(seq) and seq[i+1] is None:
            return False
    return True


