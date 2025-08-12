def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x


 def unique(seq):
    for x in seq:
        for y in seq:
            if x == y:
                break
            else:
                yield x


