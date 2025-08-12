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
	prev_right = 0
	for left, right in self._breaks :
		pos = np.where(a >= prev_right + left - total_shift)
		if pos[0].size > 0 :
			diff[pos[0][-1]] = right - left
			total_shift += right - left
			prev_right = right


