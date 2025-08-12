def is_continuous(seq) :
	non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
	for i, index in enumerate(non_null_indices [: - 1]) :
		if non_null_indices [i + 1] - index > 1 :
			return False
	return True


 def is_continuous(seq):
    null_count = 0
    for obj in seq:
        if obj is None:
            null_count += 1
    if null_count == 0:
        return True
    elif null_count == len(seq):
        return False
    else:
        non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
        for i in range(1, len(non_null_indices)):
            if non_null_indices[i] - non_null_indices[i-1] > 1:
                return False
        return True


