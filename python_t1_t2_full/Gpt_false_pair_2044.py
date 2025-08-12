def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x


 def unique(seq):
    output = []
    for x in seq:
        if x not in output:
            output.append(x)
            yield x
