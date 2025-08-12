def mssl(l) :
	best = cur = 0
	curi = starti = besti = 0
	for ind, i in enumerate(l) :
		if cur + i > 0 :
			cur += i
		else :
			cur, curi = 0, ind + 1
		if cur > best :
			starti, besti, best = curi, ind + 1, cur
	return starti, besti, best




def maximum_subsequence_sum(l) :
	maximum = tracker = 0
	tracker_index = beginning_index = ending_index = 0
	for index, item in enumerate(l) :
		if tracker + item > 0 :
			tracker += item
		else :
			tracker, tracker_index = 0, index + 1
		if tracker > maximum :
			beginning_index, ending_index, maximum = tracker_index, index + 1, tracker
	return beginning_index, ending_index, maximum
