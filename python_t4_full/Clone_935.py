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
	list_threads = []
	if ev_list:
		for args in ev_list:
			a_thread = Thread(target = self._triggerer, args = (args,))
			list_threads.append(a_thread)
	else:
		list_threads = None
	self._t_list = list_threads


