[HttpPost] public ActionResult Create (CreateOrderViewModel model) {
    try {
        var newOrder = new Order {OrderDate = DateTime.Now, OrderProduct = new OrderProduct {ProductId = SelectedProductId}};
        db.Orders.AddObject (newOrder);
        return RedirectToAction ("Index");
    }
    catch {
        return View ();
    }
}


 [HttpPost] 
public ActionResult Create(CreateOrderViewModel model){
  try{
      var today = DateTime.UtcNow;
        var newOrder = new Order {OrderDate = today, OrderProduct = new OrderProduct {ProductId = model.SelectedProductId}};
        db.Orders.InsertOnSubmit(newOrder);
        db.SubmitChanges();
        return RedirectToAction("Index");
    }
    catch{
        return View();
    }
}


