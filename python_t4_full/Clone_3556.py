def extendedString(string1, string2) :
	if len(string1) == len(string2) :
		return "".join(i for j in zip(string1, string2) for i in j)
	else :
		longer, shorter = (string1, string2) if len(string1) > len(string2) else (string2, string1)
		shorter = shorter + shorter [- 1] * (len(longer) - len(shorter))
		return "".join(i for j in zip(shorter, longer) for i in j)


    return ''.join([c for pair in zip(a.ljust(len(b), a[-1]), b.ljust(len(a), b[-1])) for c in pair])


 

def extendedString(s1, s2) :
    length_diff = abs(len(s1) - len(s2))
    if len(s1) > len(s2):
        s2 += s2[-1] * length_diff


