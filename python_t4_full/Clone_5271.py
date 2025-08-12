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






def transform_non_affine(self, a):
    breaks = np.array(self._breaks)
    total_shift = np.sum(breaks[:,1] - breaks[:, 0])
    indices = np.array([bisect.bisect_right(a, left - total_shift) for left in breaks[:, 0]])
    shifts = breaks[:, 1] - breaks[:, 0]
    diff = np.zeros(len(a))


