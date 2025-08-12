def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)


 def count_words(string) :
   words_list = string.split(' ')
   c=0
   for i in words_list:
       if i.endswith('on'):
           c+=1
           print(i, ':', c)


