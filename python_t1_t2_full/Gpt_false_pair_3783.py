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




def transform_non_affine(self, c) :
	result = np.empty_like(c)
	c_idx = 0
	csum = 0
	for left, right in self._breaks :
		while c_idx < len(c) and c [c_idx] < left :
			result [c_idx] = c [c_idx] - csum
			c_idx += 1
		while c_idx < len(c) and c [c_idx] < = right :
			result [c_idx] = left - csum
			c_idx += 1
		csum += right - left
	while c_idx < len(c) :
		result [c_idx] = c [c_idx] - csum
		c_idx += 1
	return np.array(result)
