package dao;

import model.Currency;
import jakarta.persistence.EntityManager;

public class CurrencyDao {

    public void persist(Currency currency) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }

    public Currency find(String code) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        return em.find(Currency.class, code);
    }
}

