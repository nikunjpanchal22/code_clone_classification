def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)


 def unique(items): 
	no_duplicates = [] 
	for i in items: 
		if i not in no_duplicates: 
			no_duplicates.append(i) 
	return no_duplicates


