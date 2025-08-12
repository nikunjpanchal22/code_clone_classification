def main() :
	t = np.linspace(0, 6 * np.pi, 100)
	x = np.sin(t)
	condition = x > 0
	regions = contiguous_regions(condition)
	lengths = regions [:, 1] - regions [:, 0]
	for reg, length in zip(regions, lengths) :
		print 'Condition was True for {0} seconds'.format(length)
		print '    From time {0}s to {1}s'.format(* reg)


def main():
	t = np.linspace(0, 6 * np.pi, 100)
	a = np.sin(t)
	zones = contiguous_regions(a > 0)
	times = zones[:, 1] - zones[:, 0]
	for tz, time in zip(zones, times):
		print(f'Condition was True for {time} seconds')
		print(f'    From time {tz[0]}s to {tz[1]}s')



