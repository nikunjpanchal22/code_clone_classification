def treeview_sort_column(tv, col, reverse) :
	l = [(tv.set(k, col), k) for k in tv.get_children('')]
	l.sort(key = lambda t : int(t [0]), reverse = reverse)
	for index, (val, k) in enumerate(l) :
		tv.move(k, '', index)
	tv.heading(col,
	command = lambda : treeview_sort_column(tv, col, not reverse))


 def treeview_sort_column(view, col, reverse):
	listData = [(view.set(key, col), key) for key in view.get_children('')]
	listData.sort(key = lambda t : int(t[0]), reverse=reverse)
	for index, (val, key) in enumerate(listData):
		view.move(key, '',index)
	view.heading(col, command = lambda : treeview_sort_column(view, col, not reverse))


