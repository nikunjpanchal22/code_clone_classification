def __init__(self) :
	self.fields = []
	for field_name in dir(self) :
		field = getattr(self, field_name)
		if isinstance(field, Field) :
			field.name = field_name
			self.fields.append(field)
	self.fields.sort(key = operator.attrgetter('count'))





def __init__(self):
	for field_name, field in self.__dict__.items():
		if isinstance(field, Field):
			field.name = field_name
			self.fields.append(field)


