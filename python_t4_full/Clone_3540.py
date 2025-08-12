def main() :
	t = np.linspace(0, 6 * np.pi, 100)
	x = np.sin(t)
	condition = x > 0
	regions = contiguous_regions(condition)
	lengths = regions [:, 1] - regions [:, 0]
	for reg, length in zip(regions, lengths) :
		print 'Condition was True for {0} seconds'.format(length)
		print '    From time {0}s to {1}s'.format(* reg)


		print(f'Condition was True for {length} seconds')
		print(f'    From time {zone[0]}s to {zone[1]}s')



def main():
	t = np.arange(0, 6 * np.pi, 0.06 * np.pi)
	x = np.sin(t)
	region = contiguous_regions(x > 0)


