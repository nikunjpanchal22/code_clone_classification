def matched(str) :
	diffCounter = 0
	length = len(str)
	for i in range(length) :
		if str [i] == '(' :
			diffCounter += 1
		elif str [i] == ')' :
			diffCounter -= 1
	if diffCounter == 0 :
		return True
	else :
		return False




def matched(in_string):
	counter = 0
	str_len = len(in_string)
	count = 0
	while count < str_len:
		if in_string[count] == '(':
			counter += 1
		elif in_string[count] == ')':
			counter -= 1
		count += 1
	if counter == 0:
		return True
	else:
		return False
