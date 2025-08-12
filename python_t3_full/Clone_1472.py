def oddn(x, y, z) :
	odd_number_keeper = []
	for item in [x, y, z] :
		if item % 2 == 1 :
			odd_number_keeper.append(item)
	if not odd_number_keeper :
		print( 'No odd number is found')
		return
	return max(odd_number_keeper)


 def oddn(x, y, z):
	odd_list = []
	for item in [x, y, z]:
		if item % 2 == 1:
			odd_list.append(item)
	if odd_list == []:
		print('No odd number found')
		return
	most_odd_number = 0
	for odd_number in odd_list:
		if odd_number > most_odd_number:
			most_odd_number = odd_number
	return most_odd_number


