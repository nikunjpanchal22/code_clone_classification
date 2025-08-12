def odd_numbers(my_list) :
	total = 0
	count = 0
	for number in my_list :
		if (number % 2 == 1) :
			total = total + number
		else :
			count = count + 1
	if (number == count) :
		return (0)
	else :
		return (total)




def odd_numbers(my_list):
	new_total = 0 
	evencount = 0 
	for num in my_list:
		if (num % 2 == 1):
			new_total += num 
		else:
			evencount += 1
	if (num == evencount):
		return(0)
	else:
		return(new_total)
