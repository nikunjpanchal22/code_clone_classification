def two_pair(ranks) :
	newlist = []
	for i in set(ranks) :
		if ranks.count(i) == 2 :
			newlist.append(i)
	newlist.sort(reverse = True)
	newlist = tuple(newlist)
	return None if newlist == () else newlist


def two_pair(ranks) :
	unique_ranks = set(ranks)
	pairs = []
	for rank in unique_ranks :
		if ranks.count(rank) == 2 :
			pairs.append(rank)
	
	if len(pairs) > 0 :
		pairs.sort(reverse = True)
		return tuple(pairs)
	else :
		return None



