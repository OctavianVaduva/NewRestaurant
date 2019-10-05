package service;

import java.util.List;

import date.Produs;

public interface ListaProduseInterface {
    Produs getProdus();
    List<Produs> getListaProduse();
    void addProdusNou(Produs produsNou);
}
