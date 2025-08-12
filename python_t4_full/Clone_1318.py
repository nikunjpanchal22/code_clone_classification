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
       open_list = [ '(', '[', '{' ]
       close_list = [ ')', ']', '}' ]
       stack = []

       for char in str:
           if char in open_list:
               stack.append(char)
           if char in close_list:
               pos = close_list.index(char)
               if (len(stack) > 0) and (open_list[pos] == stack[len(stack)-1]):
                   stack.pop()
               else:
                   return False
       return not stack


