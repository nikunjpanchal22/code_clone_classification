def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
   char = list(string)
   l = 0
   r = len(char) - 1
   while l < r:
      char[l], char[r] = char[r], char[l]
      l += 1
      r -= 1
   return ''.join(char)


