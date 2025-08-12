def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)




def unique(items):
	seen_already = set()
	for i in reversed (range(len(items))) :
		each_one = items[i]
		if each_one in seen_already :
			del items[i]
		else :
			seen_already.add(each_one)
