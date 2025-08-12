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
    result = np.zeros_like(a)
    csum = np.cumsum(np.diff(self._breaks, axis=1).flatten())
    breaks_flattened = self._breaks.flatten()
    indices = np.searchsorted(breaks_flattened, a, side='right')
    result = a - np.pad(csum, (1, 0))[indices // 2]


