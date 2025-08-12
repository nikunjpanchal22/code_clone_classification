def two_pair(ranks) :
	newlist = []
	for i in set(ranks) :
		if ranks.count(i) == 2 :
			newlist.append(i)
	newlist.sort(reverse = True)
	newlist = tuple(newlist)
	return None if newlist == () else newlist


def two_pair(ranks) :
	newlist = [rank for rank in set(ranks) if ranks.count(rank) == 2]
	if newlist :
		newlist.sort(reverse = True)
		return tuple(newlist)
	return None



