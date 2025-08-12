def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)


 def unique(arr):
	dup_items = set()
	uniq_items = []
	for x in arr:
		if x not in dup_items:
			dup_items.add(x)
			uniq_items.append(x)
	return uniq_items


