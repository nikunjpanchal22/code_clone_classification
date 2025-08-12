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
       s = [] 
       for i in str: 
           if i == "(": 
               s.append(i) 
           elif i == ")" and len(s) == 0: 
               return False
           elif i == ")" and s[-1] == "(": 
               s.pop()

       return len(s) == 0


