def cumulative_sum(l) :
	total = 0
	cumulative = []
	for num in l :
		total += num
		cumulative.append(total)
	return cumulative



 def cumulative_sum(l):
	sum = 0
	cumulative = []
	for num in l:
		sum += num
		cumulative.append(sum)
