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
	for element in input.split() :
		try:
			self.result.append(('number', int(element)))
		except ValueError :
			is_found = False
			for element_type, items in self.mapping.items():
				if element_type in items and element.lower() in items:
					is_found = True
					found_category = element_type
					break
			if is_found == False:
				found_category = 'error'
			self.result.append((found_category, element))
	return self.result


