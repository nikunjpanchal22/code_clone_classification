def cumulative_sum(l) :
	total = 0
	cumulative = []
	for num in l :
		total += num
		cumulative.append(total)
	return cumulative




def cumulative_sum(l):
	cumulative = []
	total = 0
	for x in l:
		total += x
		cumulative.append(total)
	return cumulative


