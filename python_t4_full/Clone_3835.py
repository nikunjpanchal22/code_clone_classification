def __init__(self, ev_list = None) :
	self._trigger = Event()
	if ev_list :
		self._t_list = [
		Thread(target = self._triggerer, args = (ev,)) for ev in ev_list
		]
	else :
		self._t_list = []


def __init__(self, ev_list=None):
    self._trigger = Event()
    self._t_list = [Thread(target=self._triggerer, args=(ev,)) for ev in ev_list] if ev_list is not None else []




