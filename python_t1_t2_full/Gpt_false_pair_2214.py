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




def overlapping(string_a, string_b) :
	match_count = 0;
	str_length1 = len(string_a)
	str_length2 = len(string_b)
	shortest_str_len = str_length1
	if str_length2 < str_length1 :
		shortest_str_len = str_length2
	for i in range(shortest_str_len) :
		if string_a [i] == string_b [i] :
			match_count += 1
	return match_count
