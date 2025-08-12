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
    if values is not None :
        try :
            self.values = int(values)
        except ValueError :
            self.values = values.count('v') + 1
    else :
        self.values += 1


