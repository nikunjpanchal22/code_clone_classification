def is_continuous(seq) :
	non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
	for i, index in enumerate(non_null_indices [: - 1]) :
		if non_null_indices [i + 1] - index > 1 :
			return False
	return True


 def is_continuous(seq):
    first_val = False
    for i in range(len(seq)):
        if seq[i] is not None:
            if first_val:
                if i + 1 != len(seq) and seq[i+1] is None:
                    return False
            else:
                first_val = True
                
    return True


