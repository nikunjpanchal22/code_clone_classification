def overlap(string1, string2) :
	count = 0;
	len1 = len(string1)
	len2 = len(string2)
	smallLen = len1
	if len2 < len1 :
		smallLen = len2
	for i in range(smallLen) :
		if string1 [i] == string2 [i] :
			count += 1
	return count


 

def overlap(string1, string2):
	count = 0
	for char1, char2 in zip(string1, string2):
		if char1 == char2:
			count += 1
	return count


