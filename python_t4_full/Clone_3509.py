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


    def process(self, word):
        if word.isdigit():
            return 'number', int(word)
        return next((category for category, item in self.mapping.items() if word.lower() in item), 'error'), word
    words = input.split()
    self.result = [self.process(word) for word in words]
    return self.result


