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




def overlap(word1, word2) :
	total_overlaps = 0;
	length1 = len(word1)
	length2 = len(word2)
	small_length = length1
	if length2 < length1 :
		small_length = length2
	for i in range(small_length) :
		if word1 [i] == word2 [i] :
			total_overlaps += 1
	return total_overlaps

