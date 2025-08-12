def __init__(self, a = None, b = None, ** kwargs) :
	self.relations = {
	"e" : {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"C" : {"req" : ["e", "a"], "func" : lambda e, a : e * 1 / (a * b)},
	"A" : {"req" : ["C", "e"], "func" : lambda e, C : cmplx_func_A(e, C)},
	"a" : {"req" : ["e", "b"], "func" : lambda e, b : e / b},
	"b" : {"req" : ["e", "a"], "func" : lambda e, a : e / a}}
	self.a = a
	self.b = b
	self.e = None
	self.C = None
	self.A = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])


 def __init__(self, a = None, b = None, ** kwargs) :
	self.relations = {
	"sum": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"div": {"req" : ["sum", "a"], "func" : lambda sum, a : sum * 1 / (a * b)},
	"funcA": {"req" : ["div", "sum"], "func" : lambda sum, div : cmplx_func_A(sum, div)},
	"first": {"req" : ["sum", "b"], "func" : lambda sum, b : sum / b},
	"second": {"req" : ["sum", "a"], "func" : lambda sum, a : sum / a}}
	self.a = a
	self.b = b
	self.sum = None
	self.div = None
	self.funcA = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
