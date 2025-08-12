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


  def matched(str):
       if not str:
           return True
       if str[0] == ')':
           return False
       elif str[0] == '(':
           return matched(str[1:])


