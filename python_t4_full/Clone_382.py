def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)


 def count_words(string) :
    for word in collection.Counter(string.split()):
        if word.endswith('on'):
            print(word, ':', collection.Counter(string.split())[word])


