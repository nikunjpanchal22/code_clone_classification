def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


def reverse(s):
    str = ""
    for i in s:
        str = i + str
    return str



