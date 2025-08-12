def treeview_sort_column(tv, col, reverse) :
	l = [(tv.set(k, col), k) for k in tv.get_children('')]
	l.sort(key = lambda t : int(t [0]), reverse = reverse)
	for index, (val, k) in enumerate(l) :
		tv.move(k, '', index)
	tv.heading(col,
	command = lambda : treeview_sort_column(tv, col, not reverse))


 def treeview_sort_column(treeview, col, reverse):
	sortedList = [(treeview.set(k, col), k) for k in treeview.get_children('')]
	sortedList.sort(key = lambda t : int(t[0]), reverse = reverse)
	for index, (val, k) in enumerate(sortedList):
		treeview.move(k, '', index)
	treeview.heading(col, command = lambda : treeview_sort_column(treeview, col, not reverse))


