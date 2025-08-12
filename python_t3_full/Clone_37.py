def __call__(self, parser, args, values, option_string = None) :
	if values is None :
		self.values += 1
	else :
		try :
			self.values = int(values)
		except ValueError :
			self.values = values.count('v') + 1
	setattr(args, self.dest, self.values)


	def __call__(self, parser, args, values, option_string = None) :
		if values is None :
			self.values += 1
		elif values == "True":
			self.values = True
		elif values == "False":
			self.values = False
		else :
			try :
				self.values = int(values)
			except ValueError :
				self.values = values.count('v') + 1
		setattr(args, self.dest, self.values)


