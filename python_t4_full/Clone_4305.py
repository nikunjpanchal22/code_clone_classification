def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


def reverse(string):
    tmp = [string[i] for i in range(len(string)-1, -1, -1)]
    return ''.join(tmp)



