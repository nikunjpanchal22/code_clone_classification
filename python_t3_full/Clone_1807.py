def transform_non_affine(self, a) :
	diff = np.zeros(len(a))
	total_shift = 0
	for left, right in self._breaks :
		pos = bisect.bisect_right(a, left - total_shift)
		if pos >= len(diff) :
			break
		diff [pos] = right - left
		total_shift += right - left
	return a + diff.cumsum()


	
 def transform_non_affine(self, a) :
	diff = np.zeros(len(a))
	total_shift = 0
	index = 0
	for left, right in self._breaks :
		while index < len(diff) and a[index] < left - total_shift:
			index +=1
		if index < len(diff):
			diff[index] = right - left
			total_shift += right - left


