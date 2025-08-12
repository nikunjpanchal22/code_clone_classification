def treeview_sort_column(tv, col, reverse) :
	l = [(tv.set(k, col), k) for k in tv.get_children('')]
	l.sort(key = lambda t : int(t [0]), reverse = reverse)
	for index, (val, k) in enumerate(l) :
		tv.move(k, '', index)
	tv.heading(col,
	command = lambda : treeview_sort_column(tv, col, not reverse))


 def treeview_sort_column(viewer, col, reverse):
	sortInfo = [(viewer.set(entry, col), entry) for entry in viewer.get_children('')]
	sortInfo.sort(key = lambda t : int(t[0]), reverse= reverse)
	for index, (val, entry) in enumerate(sortInfo):
		viewer.move(entry, '',index)
	viewer.heading(col, command = lambda : treeview_sort_column(viewer, col, not reverse))


