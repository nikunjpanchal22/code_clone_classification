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
    total = sum(number for number in my_list if number%2==1)
    count = sum(1 for number in my_list if number%2==0)

    return total if total != count else 0



