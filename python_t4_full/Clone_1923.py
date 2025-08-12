def two_pair(ranks) :
	newlist = []
	for i in set(ranks) :
		if ranks.count(i) == 2 :
			newlist.append(i)
	newlist.sort(reverse = True)
	newlist = tuple(newlist)
	return None if newlist == () else newlist


def two_pair(ranks) :
	two_pair_occurrences = [ rank for rank in set(ranks) if ranks.count(rank) == 2]
	if len(two_pair_occurrences) > 0 :
		two_pair_occurrences.sort(reverse = True)
		return tuple(two_pair_occurrences)
	else :
		return None



