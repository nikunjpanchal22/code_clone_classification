def cumulative_sum(l) :
	total = 0
	cumulative = []
	for num in l :
		total += num
		cumulative.append(total)
	return cumulative



 def cumulative_sum(l):
	total = 0
	cumulative = []
	for item in range(len(l)):
		total = total + l[item]
		cumulative.append(total)


