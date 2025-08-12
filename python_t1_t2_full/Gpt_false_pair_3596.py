def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x




def unique(seq) :
	uniq = []
	for x in seq :
		if x not in uniq :
			uniq.append(x)
			yield x

