def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp




def reverse(string):
  rev_str = ''
  for i in range(1, len(string) + 1):
    rev_str += string[-i]
  return rev_str
