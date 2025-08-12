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




def matched(string):
	diff_counter = 0
	string_length = len(string)
	index = 0
	while index < string_length:
		if string[index] == '(':
			diff_counter += 1
		elif string[index] == ')':
			diff_counter -= 1
		index += 1
	if diff_counter == 0:
		return True
	else:
		return False

