def combine_word_documents(files) :
	merged_document = Document()
	for index, file in enumerate(files) :
		sub_doc = Document(file)
		if index < len(files) - 1 :
			sub_doc.add_page_break()
		for element in sub_doc.element.body :
			merged_document.element.body.append(element)
	merged_document.save('merged.docx')


 def combine_word_documents(files) :
    joined_document = Document()
    for index, file in enumerate(files) :
        partic_document = Document(file)
        if index < len(files) - 1 :
            joined_document.add_page_break()
        for element in partic_document.element.body :
            joined_document.element.body.append(element)
    joined_document.save('joined.docx')

