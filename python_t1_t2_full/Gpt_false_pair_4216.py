def main() :
	t = np.linspace(0, 6 * np.pi, 100)
	x = np.sin(t)
	condition = x > 0
	regions = contiguous_regions(condition)
	lengths = regions [:, 1] - regions [:, 0]
	for reg, length in zip(regions, lengths) :
		print 'Condition was True for {0} seconds'.format(length)
		print '    From time {0}s to {1}s'.format(* reg)




def main() :
	list_t = np.linspace(0, 6 * np.pi, 100)
	x_axis = np.sin(list_t)
	valid_cond = x_axis > 0
	space_regions = contiguous_regions(valid_cond)
	space_lengths = space_regions [:, 1] - space_regions [:, 0]
	for each_region, length_region in zip(space_regions, space_lengths) :
		print 'Condition was True for {0} seconds'.format(length_region)
		print '    From time {0}s to {1}s'.format(* each_region)
