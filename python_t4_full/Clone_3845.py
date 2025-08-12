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
	import re
	text1 = re.sub(r'\W+', ' ', open("text1.txt").read()).split()
	text2 = re.sub(r'\W+', ' ', open("text2.txt").read()).split()


