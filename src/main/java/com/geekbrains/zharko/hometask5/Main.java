package com.geekbrains.zharko.hometask5;

public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductsDao productsDao = new ProductsDaoImpl(sessionFactoryUtils);
            /*Product product = productsDao.findById(1L);
            System.out.println(product);*/

            //System.out.println(productsDao.findAll());

             productsDao.deleteById(1L);
            //productsDao.saveOrUpdate(new Product("Чипсеки", 100));

            System.out.println(productsDao.findAll());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutDown();
        }
    }
}