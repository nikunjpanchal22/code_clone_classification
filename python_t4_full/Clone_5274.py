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
    result, a_sorted_indexes = np.zeros_like(a), np.argsort(a)
    for breaks_idx, (left, right) in enumerate(self._breaks):
        a_indexes_in_break = a_sorted_indexes[np.searchsorted(a[a_sorted_indexes], [left, right], 'right')]
        result[a_indexes_in_break] -= np.diff(self._breaks[:breaks_idx+1], axis=1).sum()
    return result



