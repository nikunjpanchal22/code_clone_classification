def two_pair(ranks) :
	newlist = []
	for i in set(ranks) :
		if ranks.count(i) == 2 :
			newlist.append(i)
	newlist.sort(reverse = True)
	newlist = tuple(newlist)
	return None if newlist == () else newlist



def two_pair(ranks):
    pair_list = []
    for i in ranks:
        if ranks.count(i) == 2 and i not in pair_list:
            pair_list.append(i)
    return tuple(pair_list)




