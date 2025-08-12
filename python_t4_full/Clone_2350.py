def is_continuous(seq) :
	non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
	for i, index in enumerate(non_null_indices [: - 1]) :
		if non_null_indices [i + 1] - index > 1 :
			return False
	return True


 def is_continuous(seq):
    start_flag = False
    for i in range(len(seq)-1):
        if seq[i] is not None and seq[i+1] is not None:
            if not start_flag:
                start_flag = True
            elif i != 0 and i + 1 != len(seq)-1:
                if i + 2 != len(seq) and seq[i+2] is None:
                    return False
        elif start_flag:
            return False
    return True


