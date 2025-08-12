def combine_word_documents(files) :
	merged_document = Document()
	for index, file in enumerate(files) :
		sub_doc = Document(file)
		if index < len(files) - 1 :
			sub_doc.add_page_break()
		for element in sub_doc.element.body :
			merged_document.element.body.append(element)
	merged_document.save('merged.docx')




def combine_word_documents_new(files):
	merged_document = Document()
	for i, file in enumerate(files):
		sub_doc = Document(file)
		if i < len(files) - 1:
			sub_doc.add_page_break()
		for elem in sub_doc.element.body:
			merged_document.element.body.append(elem)
	merged_document.save('merged_doc.docx')
