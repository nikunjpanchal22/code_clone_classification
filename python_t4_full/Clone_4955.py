def is_continuous(seq) :
	non_null_indices = [i for i, obj in enumerate(seq) if obj is not None]
	for i, index in enumerate(non_null_indices [: - 1]) :
		if non_null_indices [i + 1] - index > 1 :
			return False
	return True


from itertools import groupby
def is_continuous(seq):
    return all(len(list(grp))-1 == 0 for is_not_null, grp 
               in groupby(enumerate(seq), lambda x: x[1] is not None) if is_not_null)




