def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


def reverse(string):
    output = ""
    for i in range(len(string)):
        output = string[i] + output
    return output



