def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


def reverse(string):
    tmp = list(string)
    tmp.reverse()
    return ''.join(tmp)



