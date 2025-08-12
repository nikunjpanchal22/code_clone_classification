def cumulative_sum(l) :
	total = 0
	cumulative = []
	for num in l :
		total += num
		cumulative.append(total)
	return cumulative



def cumulative_sum(l):
    total = []
    for k in range(len(l)):
        total.append(sum(l[:k+1]))
    return total


