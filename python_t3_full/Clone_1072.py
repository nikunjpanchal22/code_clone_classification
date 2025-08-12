def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


def reverse(string):
    output = ""
    for char in range(len(string)-1, -1, -1):
        output += string[char]
    return output



