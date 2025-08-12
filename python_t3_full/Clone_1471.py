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
	odd_numbers = []
	for num in [x, y, z]:
		if num % 2 == 1:
			odd_numbers.append(num)
	if odd_numbers == []:
		print('No odd number found')
		return
	biggest_odd = 0
	for n in odd_numbers:
		if n > biggest_odd:
			biggest_odd = n
	return biggest_odd


