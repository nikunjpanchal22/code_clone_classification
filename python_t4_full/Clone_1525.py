def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
    i = len(string) - 1
    reversed_string = ""
    for x in range(i, -1, -1):
        reversed_string += string[x]
    return reversed_string


