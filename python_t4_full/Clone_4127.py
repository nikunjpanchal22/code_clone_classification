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


def matched(s) :
	openBrackets = s.count("(")
	closeBrackets = s.count(")")
	if openBrackets - closeBrackets == 0:
		return True
	return False





