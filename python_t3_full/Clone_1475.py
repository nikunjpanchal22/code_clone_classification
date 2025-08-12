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
	odd_arr = []
	for item in [x, y, z]:
		if item % 2 == 1:
			odd_arr.append(item)
	if odd_arr == []:
		print('No odd number found')
		return
	highest_odd_number = odd_arr[0]
	for item in odd_arr:
		if item > highest_odd_number:
			highest_odd_number = item
	return highest_odd_number


