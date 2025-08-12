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


    return a + np.cumsum(diff)




def transform_non_affine(self, a):
    total_shift = np.sum(np.diff(self._breaks, axis=1))
    diff = np.zeros(len(a))
    for break_loop in self._breaks:
        pos = bisect.bisect_right(a - total_shift, break_loop[0])
        if pos >= len(diff):
            break


