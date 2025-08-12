def transform_non_affine(self, a) :
	diff = np.zeros(len(a))
	total_shift = 0
	for left, right in self._breaks :
		pos = bisect.bisect_right(a, left - total_shift)
		if pos > = len(diff) :
			break
		diff [pos] = right - left
		total_shift += right - left
	return a + diff.cumsum()


        total_shift -= np.diff(break_loop)
    return a + np.cumsum(diff)




def transform_non_affine(self, a):
    cum_diff = np.zeros(len(a))
    
    for left, right in self._breaks:
        shift = right - left


