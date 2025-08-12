def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x


 def unique(seq):
    filter_set = set()
    return (x for x in seq if x not in filter_set and (filter_set.add(x) or True))


