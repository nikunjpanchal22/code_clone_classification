def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


def reverse(string):
    str_list = list(string)
    str_list.reverse()
    return ''.join(str_list)



