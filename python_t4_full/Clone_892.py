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
    odd_sum = 0
    num_even = 0
    for num in my_list:
        if num % 2 == 0:
            num_even += 1
        elif num % 2 == 1:
            odd_sum += num
    if num_even > 0 and num_even == len(my_list):
        return 0
    else:
        return odd_sum


