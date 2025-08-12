def cumulative_sum(l) :
	total = 0
	cumulative = []
	for num in l :
		total += num
		cumulative.append(total)
	return cumulative



  def cumulative_sum(l):
   cumsum = []
   total = 0 
   for number in l:
      total = total + number
      cumsum.append(total)


