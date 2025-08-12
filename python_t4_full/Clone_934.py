def __init__(self, ev_list = None) :
	self._trigger = Event()
	if ev_list :
		self._t_list = [
		Thread(target = self._triggerer, args = (ev,)) for ev in ev_list
		]
	else :
		self._t_list = []


 def __init__(self, ev_list = None):
	self._trigger = Event()
	threadlist = []
	if ev_list != None:
		for e in ev_list : 
			t = Thread(target = self._triggerer, args = (e,))
			threadlist.append(t)
	else:
		pass
	self._t_list = threadlist


