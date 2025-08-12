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
       stack = []
       for item in str:
           if item == '(':
               stack.append(item)
           elif item == ')': 
               try:
                   stack.pop()
               except IndexError:
                   return False
       return not stack


