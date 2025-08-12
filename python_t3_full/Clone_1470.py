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
	for num in [x, y, z]:
		if num % 2 == 1:
			odd_nums.append(num)
	if odd_nums == []:
		print('No odd number found')
		return
	largest_odd = odd_nums[0]
	for item in odd_nums:
		if item > largest_odd:
			largest_odd = item
	return largest_odd


