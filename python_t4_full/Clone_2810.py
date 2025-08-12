def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)


 def unique(items):
	unique_list = []
	for item in items:
		if item not in unique_list:
			unique_list.append(item)
	return unique_list


