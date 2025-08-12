def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)


 def count_words(string) :
    words = string.split(' ') 
    for word in words: 
        count = 0
        if word[-2:] == 'on': 
            for compare_word in words: 
                if word == compare_word: 
                    count += 1
            print(word, ':', count)


