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
    fusion_document = Document()
    for index, file in enumerate(files) :
        sub_document = Document(file)
        if index < len(files) - 1 :
            fusion_document.add_page_break()
        for element in sub_document.element.body :
            fusion_document.element.body.append(element)
    fusion_document.save('fusion.docx')

