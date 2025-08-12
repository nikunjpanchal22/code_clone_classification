def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)


def unique(items):
    output = []
    [_ for _ in map(lambda x:  output.append(x) if x not in output else None, items)]
    return output



