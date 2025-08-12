def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x


 def unique(seq):
    map = {}
    for x in seq:
        if x not in map:
            map[x] = 1
            yield x


