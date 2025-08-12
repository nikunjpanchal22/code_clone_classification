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
    total = 0
    even_count = 0
    for num in my_list:
        if num % 2 == 1:
            total +=num
        else:
            even_count += 1
    if len(my_list) > 0 and even_count == len(my_list):
        return 0
    elif len(my_list) == 0:
        return 0
    else:
        return total


