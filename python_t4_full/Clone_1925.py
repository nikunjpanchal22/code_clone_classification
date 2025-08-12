def two_pair(ranks) :
	newlist = []
	for i in set(ranks) :
		if ranks.count(i) == 2 :
			newlist.append(i)
	newlist.sort(reverse = True)
	newlist = tuple(newlist)
	return None if newlist == () else newlist


def two_pair(ranks) :
	result = [rank for rank in set(ranks) if ranks.count(rank) == 2]
	if result :
		result.sort(reverse = True)
		return tuple(result)
	return None


