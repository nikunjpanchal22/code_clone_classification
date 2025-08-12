def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


def reverse(string):
    tmp = list(string)
    for i in range(len(tmp)//2):
        temp = tmp[i]
        tmp[i] = tmp[len(tmp) - i -1]
        tmp[len(tmp) - i -1] = temp


