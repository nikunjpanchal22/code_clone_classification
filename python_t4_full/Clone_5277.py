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
    result = np.copy(a)
    difference = list(map(operator.sub, self._breaks[1], self._breaks[0]))
    result[a <= self._breaks[0]] -= np.cumsum([0]+difference)[np.searchsorted(self._breaks[1], a[a <= self._breaks[0]], 'right')-1]
    result[a > self._breaks[0]] -= sum(difference)


