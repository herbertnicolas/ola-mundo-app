package com.ola.mundo.app.dao;

import java.util.*;
import com.ola.mundo.app.model.Contato;

public class ContatoDao {
    private List<Contato> contatos = new ArrayList<>();

    public ContatoDao() {
        Contato contato1 = new Contato();

        contato1.setNome("Herbert Nicolas");
        contato1.setEmail("herbertnicolass@gmail.com");
        contato1.setEndereco("Rua do sei la, 132");
        contato1.setDataNascimento(new GregorianCalendar(1994,4,25));

        contatos.add(contato1);

        Contato contato2 = new Contato();

        contato1.setNome("Alexandre da Silva");
        contato1.setEmail("alexandre@gmail.com");
        contato1.setEndereco("Rua do sei la oq, 132");
        contato1.setDataNascimento(new GregorianCalendar(1994,4,25));

        contatos.add(contato2);

        Contato contato3 = new Contato();

        contato1.setNome("Igor Mesquita");
        contato1.setEndereco("Rua das ruas, 13");
        contato1.setDataNascimento(new GregorianCalendar(2000,7,23));

        contatos.add(contato3);

        Contato contato4 = new Contato();

        contato1.setNome("Yuri Marcos");
        contato1.setEmail("yurimarcos@gmail.com");
        contato1.setDataNascimento(new GregorianCalendar(1995,4,25));

        contatos.add(contato4);
    }
}
