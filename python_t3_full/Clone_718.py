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
	if ev_list :
		thread_list = list(map(lambda ev : Thread(target = self._triggerer, args = (ev,)), ev_list))
		self._t_list = thread_list
	else:
		self._t_list = []


