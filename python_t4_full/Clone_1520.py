def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
    length = len(string)
 
    if length == 1:
        return string
    else:
        return string[length-1] + reverse(string[:length - 1])


