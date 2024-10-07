package Service;

import Entity.Invoice;
import Entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class InvoiceService {
    private List<Invoice> invoices;

    public InvoiceService() {
        this.invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public void updateInvoice(Invoice updatedInvoice) {
        for (int i = 0; i < invoices.size(); i++) {
            if (invoices.get(i).getId() == updatedInvoice.getId()) {
                invoices.set(i, updatedInvoice);
                return;
            }
        }
        System.out.println("Invoice not found!");
    }

    public Invoice findInvoiceById(int id) {
        for (Invoice invoice : invoices) {
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        return null;
    }

    public List<Invoice> listInvoicesByCustomer(Customer customer) {
        List<Invoice> customerInvoices = new ArrayList<>();
        for (Invoice invoice : invoices) {
            if (invoice.getCustomer().getID() == customer.getID()) {
                customerInvoices.add(invoice);
            }
        }
        return customerInvoices;
    }
}