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


    return sum(odds) if len(odds) != count else 0



def odd_numbers(my_list):
    total = count = 0
    for number in my_list:
        total+=number if number%2!=0 else 0
        count+= 1 if number%2==0 else 0

    return total if total != count else 0


