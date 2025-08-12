def treeview_sort_column(tv, col, reverse) :
	l = [(tv.set(k, col), k) for k in tv.get_children('')]
	l.sort(key = lambda t : int(t [0]), reverse = reverse)
	for index, (val, k) in enumerate(l) :
		tv.move(k, '', index)
	tv.heading(col,
	command = lambda : treeview_sort_column(tv, col, not reverse))


 def treeview_sort_column(tree, col, reverse):
	info = [(tree.set(item, col), item) for item in tree.get_children('')]
	info.sort(key = lambda t : int(t[0]), reverse = reverse)
	for index, (val, item) in enumerate(info):
		tree.move(item, '', index)
	tree.heading(col, command = lambda : treeview_sort_column(tree, col, not reverse))


