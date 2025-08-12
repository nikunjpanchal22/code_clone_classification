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




def transform_non_affine(self, b) :
	result = np.empty_like(b)
	b_idx = 0
	csum = 0
	for left, right in self._breaks :
		while b_idx < len(b) and b [b_idx] < left :
			result [b_idx] = b [b_idx] - csum
			b_idx += 1
		while b_idx < len(b) and b [b_idx] < = right :
			result [b_idx] = left - csum
			b_idx += 1
		csum += right - left
	while b_idx < len(b) :
		result [b_idx] = b [b_idx] - csum
		b_idx += 1
	return result

