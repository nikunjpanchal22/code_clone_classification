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
    'selected' : self.value() == self.all_value,
    'query_string' : cl.get_query_string({self.parameter_name : self.all_value}, []),
    'display' : _('All')
    }
    for each in self.lookup_choices:
        yield {
            'selected': self.value() == each[0],
            'query_string': cl.get_query_string({self.parameter_name : each[0]}, []),
            'display': each[1],
        }


