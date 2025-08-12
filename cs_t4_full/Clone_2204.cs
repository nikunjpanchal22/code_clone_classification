private void btnAdd_Click (object sender, RoutedEventArgs e) {
    string customer = btnEditCustomer1.Text;
    string piece = btnPiece.Text;
    string material = txtMaterial.Text;
    int quantity = Convert.ToInt32 (txtQuantity.Text);
    float weight = float.Parse (txtWeight.Text);
    if (customer != null && piece != null && material != null) {
        var item = new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight};
        AllItems.Add (item);
    }
}



private void btnAdd_Click (object sender, RoutedEventArgs e) {
    var customer = txtCustomer.Text;
    var piece = txtItem.Text;
    var material = txtMaterial.Text;
    int quantity = int.Parse (txtCount.Text);
    float weight = float.Parse (txtLoad.Text);
    if (string.IsNullOrEmpty(customer) == false && string.IsNullOrEmpty(piece) == false && string.IsNullOrEmpty(material) == false) {
        var item = new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight};
        AllItems.Add (item);
    }
}


