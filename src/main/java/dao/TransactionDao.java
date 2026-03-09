package dao;

import model.Transaction;
import jakarta.persistence.EntityManager;

public class TransactionDao {

    public void persist(Transaction transaction) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();
    }

    public Transaction find(int id) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        return em.find(Transaction.class, id);
    }
}

