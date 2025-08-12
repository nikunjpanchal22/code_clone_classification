def treeview_sort_column(tv, col, reverse) :
	l = [(tv.set(k, col), k) for k in tv.get_children('')]
	l.sort(key = lambda t : int(t [0]), reverse = reverse)
	for index, (val, k) in enumerate(l) :
		tv.move(k, '', index)
	tv.heading(col,
	command = lambda : treeview_sort_column(tv, col, not reverse))


 def treeview_sort_column(view, col, reverse):
	sort_data = [(view.set(item, col), item) for item in view.get_children('')]
	sort_data.sort(key = lambda t : int(t[0]), reverse=reverse)
	for index, (val, item) in enumerate(sort_data):
		view.move(item, '', index)
	view.heading(col, command = lambda : treeview_sort_column(view, col, not reverse))


