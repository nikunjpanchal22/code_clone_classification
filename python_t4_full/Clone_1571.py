def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
   newStr = ""
   for i in range(len(s)-1, -1, -1):
       newStr += s[i]
   return newStr


