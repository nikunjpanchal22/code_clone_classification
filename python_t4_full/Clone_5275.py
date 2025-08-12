def transform_non_affine(self, a) :
	result = np.empty_like(a)
	a_idx = 0
	csum = 0
	for left, right in self._breaks :
		while a_idx < len(a) and a [a_idx] < left :
			result [a_idx] = a [a_idx] - csum
			a_idx += 1
		while a_idx < len(a) and a [a_idx] < = right :
			result [a_idx] = left - csum
			a_idx += 1
		csum += right - left
	while a_idx < len(a) :
		result [a_idx] = a [a_idx] - csum
		a_idx += 1
	return result



def transform_non_affine(self, a):
    result, breaks_intervals = np.array(a), np.subtract(*self._breaks.T)
    for idx, (lower, upper) in enumerate(self._breaks):
        mask = (lower <= result) & (result < upper)
        result[mask] -= breaks_intervals[:idx+1].sum()
    return result



