def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
    string_list = list(string)
    string_list.sort(reverse=True)
    return ''.join(string_list)


