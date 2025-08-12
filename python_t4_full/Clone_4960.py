def strip_output(nb) :
	for ws in nb.worksheets :
		for cell in ws.cells :
			if hasattr(cell, "outputs") :
				cell.outputs = []
			if hasattr(cell, "prompt_number") :
				del cell ["prompt_number"]



def strip_output(nb):
    [setattr(cell, "outputs", []) for ws in nb.worksheets for cell in ws.cells if hasattr(cell, "outputs")]
    [delattr(cell, "prompt_number") for ws in nb.worksheets for cell in ws.cells if hasattr(cell, "prompt_number")]




