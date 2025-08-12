def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)



import collections
def count_words(string) :
    counter = collections.Counter(string.split())
    for word in counter:
        if word.endswith("on") :
            print (f"{word} : {counter[word]}")
        


