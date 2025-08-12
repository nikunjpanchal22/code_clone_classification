def translation_comparison() :
	import re
	file1 = open("text1.txt", "r")
	file2 = open("text2.txt", "r")
	text1 = file1.read()
	text2 = file2.read()
	text1 = set(re.findall(r'\w+', text1))
	text2 = set(re.findall(r'\w+', text2))
	return list(text1.difference(text2))


 def translation_comparison() :
    array1 = open("text1.txt", "r").read().split()
    array2 = open("text2.txt", "r").read().split()
    words1 = set()
    words2 = set()
    for word1 in array1:
        words1.add(word1)
    for word2 in array2:
        words2.add(word2) 
    difference = words1.difference(words2)
    return difference


