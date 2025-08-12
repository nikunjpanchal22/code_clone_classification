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




def balanced(string):
	diff = 0
	length = len(string)
	for i in range(length):
		if string[i] == '(':
			diff += 1
		elif string[i] == ')':
			diff -=1
	if diff == 0:
		return True
	else:
		return False
