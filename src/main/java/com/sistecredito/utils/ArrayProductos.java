package com.sistecredito.utils;

import com.sistecredito.models.ProductoModel;

import java.util.ArrayList;

public class ArrayProductos {

    private static ArrayList<ProductoModel> productoModelsList = new ArrayList<>();


    public static void setArrayProductos(String nombre, int cantidad, String precio){
        ProductoModel productoModel = new ProductoModel();
        productoModel.setNombre(nombre);
        productoModel.setCantidad(cantidad);
        productoModel.setPrecio(precio);
        productoModelsList.add(productoModel);
    }


    public static ArrayList<ProductoModel> getArrayProductos(){
        return productoModelsList;
    }

    public static int getCantidad(){
        return productoModelsList.size();
    }

    public static String getSumatoria(){
        int total = 0;
        for (int i = 0; i < productoModelsList.size(); i++) {
            total = total + getArrayProductos().get(i).getCantidad();
        }
        return String.valueOf(total);
    }

    public static String getSubTotal(){
        Double total = 0.0;
        for (int i = 0; i < productoModelsList.size(); i++) {
            total = total +(Double.parseDouble(getArrayProductos().get(i).getPrecio()) * getArrayProductos().get(i).getCantidad());
            System.out.println(total);
        }
        return String.valueOf(Math.round(total*100.0)/100.0);
    }

}
