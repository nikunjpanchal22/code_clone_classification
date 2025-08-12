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
       open_list = ["("] 
       close_list = [")"] 
       stack = [] 

       for i in str: 
           if i in open_list: 
               stack.append(i) 
           elif i in close_list: 
               idx = close_list.index(i) 
               if (len(stack) > 0) and (open_list[idx] == stack[len(stack)-1]): 
                   stack.pop() 
               else: 
                   return False
       if len(stack) == 0: 
           return True


