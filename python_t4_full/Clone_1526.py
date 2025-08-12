def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
    l = list(string)
    l.reverse()
    reversed_string = ''.join(map(str, l))
    return reversed_string


