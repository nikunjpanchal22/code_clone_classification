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
       cur_count = 0
       for p in str:
           if p == "(":
               cur_count += 1
           elif p == ")":
               cur_count -= 1
               if cur_count < 0:
                   return False
       return  cur_count == 0


