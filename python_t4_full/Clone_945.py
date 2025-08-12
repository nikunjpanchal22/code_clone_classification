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
    from collections import Set 
    file_1 = open("text1.txt", "r")
    file_2 = open("text2.txt", "r")
    text1 = file_1.read().split()
    text2 = file_2.read().split()
    set1 = Set(text1)
    set2 = Set(text2)
    return list(set1.difference(set2)) 


