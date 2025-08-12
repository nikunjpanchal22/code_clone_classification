def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)


 def unique(items):
	itemdict = {}
	uniqitems = []
	for item in items:
		if item not in itemdict:
			itemdict[item] = 1
			uniqitems.append(item)
	return uniqitems


