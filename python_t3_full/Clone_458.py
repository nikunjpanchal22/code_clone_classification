def extendedString(string1, string2) :
	if len(string1) == len(string2) :
		return "".join(i for j in zip(string1, string2) for i in j)
	else :
		longer, shorter = (string1, string2) if len(string1) > len(string2) else (string2, string1)
		shorter = shorter + shorter [- 1] * (len(longer) - len(shorter))
		return "".join(i for j in zip(shorter, longer) for i in j)


 def extendedString(firstString, secondString):
	if len(firstString) == len(secondString):
		return ''.join([x + y for x, y in zip(firstString, secondString)])
	else:
		longString, shortString = (firstString, secondString) if len(firstString) > len(secondString) else (secondString, firstString)
		shortString += shortString[-1] * (len(longString) - len(shortString))
		return ''.join([x + y for x, y in zip(longString, shortString)])


