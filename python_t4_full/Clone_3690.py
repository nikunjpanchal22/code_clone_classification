def __init__(self, f, request, params, model, model_admin, field_path = None) :
	super(IsFreePostage, self).__init__(f, request, params, model,
	model_admin, field_path)
	self.removes = {
	'Yes' : ['postage__gt'],
	'No' : ['postage__exact'],
	'All' : ['postage__exact', 'postage__gt']}
	self.links = (
	('All', {}),
	('Yes', {'postage__exact' : 0}),
	('No', {'postage__gt' : 0}))
	if request.GET.has_key('postage__exact') :
		self.ttl = 'Yes'
	elif request.GET.has_key('postage__gt') :
		self.ttl = 'No'
	else :
		self.ttl = 'All'


def __init__(self, f, request, params, model, model_admin, field_path=None):
    super().__init__(f, request, params, model, model_admin, field_path)
    self.removes = {'Yes': ['age__gt'], 'No': ['age__exact'], 'All': ['age__exact', 'age__gt']}
    self.links = (('All', {}), ('Yes', {'age__exact': 0}), ('No', {'age__gt': 0}))
    self.ttl = request.GET.get('age__exact', request.GET.get('age__gt', 'All'))




