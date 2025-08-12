def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x


 def unique(seq):
    no_doubles = []
    for x in seq:
        if x not in no_doubles:
            no_doubles.append(x)
            yield x
