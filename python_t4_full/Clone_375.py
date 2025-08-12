def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)


 def count_words(string) :
    string_list = list(string.split())
    word_counts = {}
    for word in string_list:
        if word.endswith("on"):
            if word in word_counts:
                word_counts[word] += 1
            else:
                word_counts[word] = 1
    for wc in word_counts:
        print(wc, ':', word_counts[wc])


