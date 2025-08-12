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
       open_list  = list('(') 
       close_list = list(')') 
       stack = [] 

       for parentheses in str: 
           if parentheses in open_list: 
               stack.append(parentheses) 
           if parentheses in close_list: 
               if(stack and open_list.index(stack.pop()) != close_list.index(parentheses)):
                   return False

       return stack==[ ]


