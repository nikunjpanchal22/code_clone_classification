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
	odd_nums = []
	for number in [x, y, z]:
		if number % 2 == 1:
			odd_nums.append(number)
	if odd_nums == []:
		print('No odd number found')
		return
	highest_odd_num = 0
	for num in odd_nums:
		if num > highest_odd_num:
			highest_odd_num = num
	return highest_odd_num


