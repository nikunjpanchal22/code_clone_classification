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




def scan(self, input):
    words = input.split()
    self.result = list(map(lambda word: ('number', int(word)) if word.isdigit() else (next((k for k, v in self.mapping.items() if word.lower() in v), 'error'), word), words))
    return self.result






