def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
    reversed_string=""
    for i in range(len(string)):
        reversed_string=string[-(i+1)]+reversed_string
    return reversed_string


