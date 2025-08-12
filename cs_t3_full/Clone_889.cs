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


public ActionResult Create(CreateOrderViewModel model){
    try{
        var orderDate = DateTime.Today;
        var newOrder = new Order (orderDate, model.SelectedProductId);

        db.Orders.AddObject(newOrder);
        db.SaveChanges();
        return RedirectToAction("Index");
    }
    catch{
        return View();
    }
}


