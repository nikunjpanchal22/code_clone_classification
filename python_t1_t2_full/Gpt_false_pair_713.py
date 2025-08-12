def cumulative_sum(l) :
	total = 0
	cumulative = []
	for num in l :
		total += num
		cumulative.append(total)
	return cumulative



def cumulative_sum(l):
	total_sum = 0
	cumulative_list = []
	for element in l:
		total_sum += element 
		cumulative_list.append(total_sum)
