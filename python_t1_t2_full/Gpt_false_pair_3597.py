def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x




def unique(seq):
	processed_items = set()
	for x in seq:
		if x not in processed_items:
			processed_items.add(x)
			yield x
