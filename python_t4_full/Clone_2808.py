def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)


 def unique(items): 
	list_unique = [] 
	for x in items: 
		if x not in list_unique: 
			list_unique.append(x) 
	return list_unique 


