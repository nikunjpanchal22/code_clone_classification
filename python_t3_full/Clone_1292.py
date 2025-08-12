def two_pair(ranks) :
	newlist = []
	for i in set(ranks) :
		if ranks.count(i) == 2 :
			newlist.append(i)
	newlist.sort(reverse = True)
	newlist = tuple(newlist)
	return None if newlist == () else newlist


def two_pair(ranks) :
	two_pairs = []
	for rank in set(ranks) :
		if ranks.count(rank) == 2 :
			two_pairs.append(rank)
			
	if len(two_pairs) > 0 :
		two_pairs.sort(reverse = True)
		return tuple(two_pairs)
	else :
		return None



