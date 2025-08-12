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
       parentheses = 0
       for p in str:
           if p == '(':
               parentheses += 1
           elif p == ')':
               if parentheses == 0:
                   return False
               else:
                   parentheses -= 1
       return parentheses == 0


