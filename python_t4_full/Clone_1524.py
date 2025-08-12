def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
    reversed_string = ""
    i = len(string) - 1
    while i >= 0: 
        reversed_string += string[i]
        i -= 1
    return reversed_string


