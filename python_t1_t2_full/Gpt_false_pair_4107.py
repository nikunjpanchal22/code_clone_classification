def bitwise_or(num1, num2) :
	new_num1 = list(num1 [2 :])
	new_num2 = list(num2 [2 :])
	if len(num1) > len(num2) :
		new_num2 [: 0] = '0' * (len(num1) - len(num2))
	elif len(num1) < len(num2) :
		new_num1 [: 0] = '0' * (len(num2) - len(num1))
	new_num = []
	for c1, c2 in zip(new_num1, new_num2) :
		if c1 == "1" or c2 == "1" :
			new_num.append("1")
		else :
			new_num.append(c1)
	return '0b' + ''.join(new_num)




def bitwise_or_type3(num_one, num_two) :
	new_num_one = list(num_one[2:])
	new_num_two = list(num_two[2:])
	if len(num_one) > len(num_two) :
		new_num_two[: 0] = '0' * (len(num_one) - len(num_two))
	elif len(num_one) < len(num_two) : 
		new_num_one[: 0] = '0' * (len(num_two) - len(num_one))
	new_number = []
	for c_one, c_two in zip(new_num_one, new_num_two) :
		if (c_one == "1") or (c_two == "1") :
			new_number.append("1")
		else :
			new_number.append(c_one)
	return '0b' + ''.join(new_number)
