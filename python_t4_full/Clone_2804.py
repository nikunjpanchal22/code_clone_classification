def unique(items) :
	seen = set()
	for i in xrange(len(items) - 1, - 1, - 1) :
		it = items [i]
		if it in seen :
			del items [i]
		else :
			seen.add(it)


 def unique(items):
	result = []
	seen = set()
	for item in items:
		if item not in seen:
			seen.add(item)
			result.append(item)
	return result


