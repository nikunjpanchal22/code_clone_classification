def extendedString(string1, string2) :
	if len(string1) == len(string2) :
		return "".join(i for j in zip(string1, string2) for i in j)
	else :
		longer, shorter = (string1, string2) if len(string1) > len(string2) else (string2, string1)
		shorter = shorter + shorter [- 1] * (len(longer) - len(shorter))
		return "".join(i for j in zip(shorter, longer) for i in j)






def extendedString(string1, string2):
    while len(string1) != len(string2):
        if len(string1) < len(string2): string1 += string1[-1]


