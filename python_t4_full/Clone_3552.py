def extendedString(string1, string2) :
	if len(string1) == len(string2) :
		return "".join(i for j in zip(string1, string2) for i in j)
	else :
		longer, shorter = (string1, string2) if len(string1) > len(string2) else (string2, string1)
		shorter = shorter + shorter [- 1] * (len(longer) - len(shorter))
		return "".join(i for j in zip(shorter, longer) for i in j)




def extendedString(string1, string2):
    def adjust(s1, s2):
        return s1 + s1[-1] * (len(s2) - len(s1))
    
    if len(string1) != len(string2):
        if len(string1) > len(string2):
            string2 = adjust(string2, string1)
        else:
            string1 = adjust(string1, string2)

    return ''.join(f'{x}{y}' for x, y in zip(string1, string2))


