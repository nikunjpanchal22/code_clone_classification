def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)


 def unique(items): 
    uniq_item = []
    for x in items: 
        if x not in uniq_item: 
            uniq_item.append(x)
    uniq_item.sort() 
    return uniq_item   


