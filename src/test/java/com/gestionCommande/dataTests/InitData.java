package com.gestionCommande.dataTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InitData
{
    @Test
    @Sql("/sqlScripts/users.sql")
    public void initUsers()
    {

    }

    @Test
    @Sql("/sqlScripts/produits.sql")
    public void initProduits()
    {

    }

    @Test
    @Sql("/sqlScripts/clients.sql")
    public void initClients()
    {

    }
}
