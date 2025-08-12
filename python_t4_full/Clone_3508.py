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
    def fn(word):
        try:
            return 'number', int(word)
        except:
            return next((category for category, item in self.mapping.items() if word.lower() in item), 'error'), word
    self.result = list(map(fn, input.split()))


