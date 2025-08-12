def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string): 
  rev_string = ""
  for i in range(len(string)-1,-1,-1):
    rev_string += string[i]
  return rev_string


