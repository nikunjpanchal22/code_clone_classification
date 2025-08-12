def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string): 
  rev_string = ""
  index = len(string) - 1
  while (index >= 0):
    rev_string += string[index]
    index = index - 1
  return rev_string


