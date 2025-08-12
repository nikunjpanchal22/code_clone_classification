def show_progress(block_num, block_size, total_size) :
	global pbar
	if pbar is None :
		pbar = progressbar.ProgressBar(maxval = total_size)
	downloaded = block_num * block_size
	if downloaded < total_size :
		pbar.update(downloaded)
	else :
		pbar.finish()
		pbar = None


 

def show_progress(block_num, block_size, total_size):
	global pbar
	pbar = progressbar.ProgressBar(maxval = total_size) if not pbar else pbar
	dl_size = block_num * block_size
	next_step = pbar.update(dl_size) if dl_size < total_size else pbar.finish()


