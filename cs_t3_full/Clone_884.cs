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
        var productId = model.SelectedProductId;
        var orderDate = DateTime.Now;
        var order = new Order(productId, orderDate);
        db.Orders.InsertOnSubmit(order);
        db.SubmitChanges();
        return RedirectToAction("Index");
    }
    catch{
        return View();
    }
}


