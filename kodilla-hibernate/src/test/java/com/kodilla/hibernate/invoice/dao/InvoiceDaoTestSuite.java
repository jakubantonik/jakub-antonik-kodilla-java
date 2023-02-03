package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;



    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("car");
        Product product2 = new Product("bike");

        Item item1 = new Item(product1, new BigDecimal(200000), 1, new BigDecimal(200000));
        Item item2 = new Item(product2, new BigDecimal(3000), 2, new BigDecimal(3000));

        Invoice invoice = new Invoice("2023/02/03");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assertions.assertNotEquals(0,invoice);

        //CleanUp
        invoiceDao.deleteById(id);

    }

}
