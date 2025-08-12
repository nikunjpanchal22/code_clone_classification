def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string): 
   rev_string = ""
   for c in string:
       rev_string = c + rev_string
   return rev_string


