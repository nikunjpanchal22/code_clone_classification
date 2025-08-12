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




def bitwise_or_type4(num_a, num_b) :
	new_num_a = list(num_a[2:])
	new_num_b = list(num_b[2:])
	if len(num_a) > len(num_b) :
		new_num_b[: 0] = '0' * (len(num_a) - len(num_b))
	elif len(num_a) < len(num_b) : 
		new_num_a[: 0] = '0' * (len(num_b) - len(num_a))
	new_num = []
	for c_a, c_b in zip(new_num_a, new_num_b) :
		if (c_a == "1") or (c_b == "1") :
			new_num.append("1")
		else :
			new_num.append(c_a)
	return '0b' + ''.join(new_num)
