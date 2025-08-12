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
    t = np.linspace(0, 6 * np.pi, 100)
    x = np.arcsin(t)
    condition = x > 0
    regions = contiguous_regions(condition)
    length = regions[:, 1] - regions[:, 0]
    for reg, length in zip(regions, length):
       print("The condition was true for {0} seconds".format(length))
