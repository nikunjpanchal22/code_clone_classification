def strip_output(nb) :
	for ws in nb.worksheets :
		for cell in ws.cells :
			if hasattr(cell, "outputs") :
				cell.outputs = []
			if hasattr(cell, "prompt_number") :
				del cell ["prompt_number"]


from itertools import filterfalse
def strip_output(nb):
    list(filterfalse(lambda cell: hasattr(cell, "outputs") and setattr(cell, "outputs", []), [cell for ws in nb.worksheets for cell in ws.cells]))
    list(filterfalse(lambda cell: hasattr(cell, "prompt_number") and delattr(cell, "prompt_number"), [cell for ws in nb.worksheets for cell in ws.cells]))



