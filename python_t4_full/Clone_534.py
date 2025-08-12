def scan(self, input) :
	self.result = []
	for word in input.split() :
		try :
			self.result.append(('number', int(word)))
		except ValueError :
			for category, item in self.mapping.items() :
				if word.lower() in item :
					found_category = category
					break
				else :
					found_category = 'error'
			self.result.append((found_category, word))
	return self.result


#gpt output=============
 def scan(self, input) :
    self.result = []
   words_list = input.split()
   for i in range(len(words_list)):
	   try :
		   self.result.append(('number', int(words_list[i])))
	   except ValueError :
		   for category in self.mapping :
			   if words_list[i] in self.mapping[category] :
				   found_category = category
				   break
		   self.result.append((found_category, words_list[i]))


