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




def overlap_3(string1, string2) :
	count = 0
	len1 = len(string1)
	len2 = len(string2)
	smaller = len1
	if len2 < len1 :
		smaller = len2
	for index in range(smaller) :
		if string1 [index] == string2 [index] :
			count += 1
	return count

