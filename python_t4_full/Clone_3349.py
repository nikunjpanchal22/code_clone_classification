def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)





import collections
def count_words(string) :
    word_list = string.split()
    for word in word_list:
        if word.endswith('on'):
            print(word, ':', word_list.count(word))


