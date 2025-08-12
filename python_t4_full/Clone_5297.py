def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)




def unique(items):
	seen = []
	[seen.append(i) for i in items if not seen.count(i)]
	return seen


