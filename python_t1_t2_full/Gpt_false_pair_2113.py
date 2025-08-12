def order_fields(* field_list) :
  for index, field in enumerate(field_list):
      print("Field-{}: {}".format(index+1, field.upper()))


 def order_fields(*field_list):
   for i, item in enumerate(field_list):
       print("Field-{}: {}".format(i+1, item.upper()))
