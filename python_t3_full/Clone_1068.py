def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
   rev_string = ''
   for char in string:
      rev_string = char + rev_string
   return rev_string


