def cumulative_sum(l) :
	total = 0
	cumulative = []
	for num in l :
		total += num
		cumulative.append(total)
	return cumulative



 def cumulative_sum(l):
	total_sum = 0
	cum_list = [] 
	for i in l:
		total_sum += i
		cum_list.append(total_sum)
