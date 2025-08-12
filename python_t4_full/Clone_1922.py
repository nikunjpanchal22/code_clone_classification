def two_pair(ranks) :
	newlist = []
	for i in set(ranks) :
		if ranks.count(i) == 2 :
			newlist.append(i)
	newlist.sort(reverse = True)
	newlist = tuple(newlist)
	return None if newlist == () else newlist


def two_pair(ranks) :
	result = []
	counts = collections.Counter(ranks)
	for i in counts :
		if counts[i] == 2 :
			result.append(i)
	result.sort(reverse = True)
	return tuple(result) if len(result) > 0 else None



