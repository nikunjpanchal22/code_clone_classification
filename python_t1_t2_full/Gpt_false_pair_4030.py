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




def matched(inputString):
	counter = 0
	stringLength = len(inputString)
	for x in range(stringLength):
		if inputString[x] == '(':
			counter += 1
		elif inputString[x] == ')':
			counter -= 1
	if counter == 0:
		return True
	else:
		return False

