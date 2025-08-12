def extendedString(string1, string2) :
	if len(string1) == len(string2) :
		return "".join(i for j in zip(string1, string2) for i in j)
	else :
		longer, shorter = (string1, string2) if len(string1) > len(string2) else (string2, string1)
		shorter = shorter + shorter [- 1] * (len(longer) - len(shorter))
		return "".join(i for j in zip(shorter, longer) for i in j)


Python
def extendedString(s1, s2):
    s1, s2 = (s1, s2.ljust(len(s1), s2[-1])) if len(s1) > len(s2) else (s1.ljust(len(s2), s1[-1]), s2)
    return ''.join(a + b for a, b in zip(s1, s2))



