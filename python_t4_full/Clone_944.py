def translation_comparison() :
	import re
	file1 = open("text1.txt", "r")
	file2 = open("text2.txt", "r")
	text1 = file1.read()
	text2 = file2.read()
	text1 = set(re.findall(r'\w+', text1))
	text2 = set(re.findall(r'\w+', text2))
	return list(text1.difference(text2))


 def translation_comparison():
    file1 = open('text1.txt', 'r')
    file2 = open('text2.txt', 'r')
    text1 = file1.read().split()
    text2 = file2.read().split()
    text1_set = set(text1)
    text2_set = set(text2)
    difference = text1_set.difference(text2_set)
    return list(difference)


