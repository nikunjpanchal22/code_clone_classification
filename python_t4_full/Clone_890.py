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
    even_count = 0
    for i in my_list:
        if i % 2 == 1:
            odd_sum += i
        else:
            even_count += 1
    if len(my_list) > 0 and even_count == len(my_list):
        return 0
    else:
        return odd_sum


