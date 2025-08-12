def two_pair(ranks) :
	newlist = []
	for i in set(ranks) :
		if ranks.count(i) == 2 :
			newlist.append(i)
	newlist.sort(reverse = True)
	newlist = tuple(newlist)
	return None if newlist == () else newlist



def two_pair(ranks):
    pair_list = [i for i in set(ranks) if ranks.count(i) == 2]
    if pair_list:
        return tuple(sorted(pair_list, reverse=True))
    else:
        return None 




