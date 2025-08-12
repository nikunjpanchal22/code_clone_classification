def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


def reverse(string):
  reversed_string = ''
  index = len(string) - 1
  while index >= 0:
      reversed_string += string[index]
      index -= 1
  return reversed_string


