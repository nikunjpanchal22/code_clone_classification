def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
   stack = []
   for c in s:
       stack.append(c)
   sNew = ""
   while stack:
       sNew += stack.pop()
   return sNew


