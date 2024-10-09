package Service;

import Entity.Gender;
import Entity.Invoice;
import iGeneric.Generic;

import java.util.ArrayList;
import java.util.List;

public class InvoiceService implements Generic<Invoice> {
    private List<Invoice> invoices = new ArrayList<>();

    @Override
    public void update(Invoice object) {

    }

    @Override
    public Invoice getById(int id) {
        return invoices.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void DiscountForFemalesInAugust() {
        for (Invoice invoice : invoices) {
            if (invoice.getCustomer().getGender() == Gender.F && invoice.getDateTime().getMonthValue() == 8) {
                double discountAmount = invoice.getAmount() * 0.10;
                invoice.setAmount(invoice.getAmount() - discountAmount);
                update(invoice);
            }
        }
    }

    @Override
    public List<Invoice> getByName(String name) {
        return null;
    }
}
