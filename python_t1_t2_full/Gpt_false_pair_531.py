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


  def scan(self, input) : 
	self.result = []
	for i in input.split() :
		try : 
			self.result.append(('number', int(i)))
		except ValueError :
			flag = 0
			for category, item in self.mapping.items() :
				if i.lower() in item :
					found_category = category
					flag = 1
					break
			if flag == 0 :
				found_category = 'error'
			self.result.append((found_category, i))
	return self.result
