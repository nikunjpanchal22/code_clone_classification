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
    var customer = customerEditBox.Text;
    var piece = pieceBox.Text;
    var material = materialBox.Text;
    int quantity = int.Parse (quantityBox.Text);
    float weight = float.Parse (weightBox.Text);
    if (!string.IsNullOrWhiteSpace(customer) && !string.IsNullOrWhiteSpace(piece) && !string.IsNullOrWhiteSpace(material)) {
        var item = new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight};
        AllItems.Add (item);
    }
}


