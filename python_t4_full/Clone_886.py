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
    odd_total = 0
    even_counter = 0
    for number in my_list:
        if number % 2 == 1:
            odd_total += number
        else:
            even_counter += 1
    if even_counter == len(my_list):
        return 0
    elif not my_list:
        return 0
    else:
        return odd_total


