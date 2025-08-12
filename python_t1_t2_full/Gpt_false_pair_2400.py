def combine_word_documents(files) :
	combined_document = Document('empty.docx')
	count, number_of_files = 0, len(files)
	for file in files :
		sub_doc = Document(file)
		if count < number_of_files - 1 :
			sub_doc.add_page_break()
		for element in sub_doc._document_part.body._element :
			combined_document._document_part.body._element.append(element)
		count += 1
	combined_document.save('combined_word_documents.docx')




def combine_word_documents_three(files) :
	combined_document = Document('empty.docx')
	count, number_of_files = 0, len(files)
	for file in files :
		sub_doc = Document(file)
		if count < number_of_files - 1 :
			sub_doc.add_page_break()
		for element in sub_doc._document_part.body._element :
			combined_document._document_part.body._element.append(element)
		count += 1
	combined_document.save('combined_word_document_three.docx')

