def choices(self, cl) :
	yield {
	'selected' : self.value() == self.all_value,
	'query_string' : cl.get_query_string({self.parameter_name : self.all_value}, []),
	'display' : _('All'),
	}
	for lookup, title in self.lookup_choices :
		yield {
		'selected' : self.value() == lookup,
		'query_string' : cl.get_query_string({self.parameter_name : lookup}, []),
		'display' : title,
		}


 def choices(self, cl) :
    yield {
    'selected': self.value() == self.all_value,
    'query_string': cl.get_query_string({self.parameter_name : self.all_value}, []),
    'display': _('All'),
    }
    for value, name in self.lookup_choices:
        yield {
            'selected': self.value() == value,
            'query_string': cl.get_query_string({self.parameter_name : value}, []),
            'display': name,
        }
