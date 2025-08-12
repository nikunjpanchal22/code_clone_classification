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
	left, right = self._breaks[-1]
	for i in range (len(diff)-1, -1 ,-1 ) :
		if a[i] < left - total_shift :
			diff[i] = right - left
			total_shift += right - left
			left = self._breaks[-2]
			right = left + 1


