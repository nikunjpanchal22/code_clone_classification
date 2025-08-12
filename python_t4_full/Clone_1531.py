def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(text):
    x = ''
    length = len(text) - 1
    while length >= 0:
        x += text[length]
        length -= 1
    return x


