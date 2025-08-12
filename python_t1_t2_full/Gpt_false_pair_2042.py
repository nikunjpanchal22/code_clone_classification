def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x


 def unique(seq):
    seen_values = []
    for x in seq:
        if x not in seen_values:
            seen_values.append(x)
            yield x
