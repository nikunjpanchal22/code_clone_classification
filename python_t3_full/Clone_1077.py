def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string) :
    reversed_string = ""
    for letter in reversed(string):
        reversed_string += letter
    return reversed_string


