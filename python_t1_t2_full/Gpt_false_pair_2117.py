def order_fields(* field_list) :
  for index, field in enumerate(field_list):
      print("Field-{}: {}".format(index+1, field.upper()))


 def order_fields(*fields):
   for index, value in enumerate(fields):
       print("Field-{}: {}".format(index+1, value.upper()))
