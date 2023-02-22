package com.sistecredito.utils;

import com.sistecredito.models.ProductoModel;

import java.util.ArrayList;

public class ArrayProductos {

    private static ArrayList<ProductoModel> productoModelsList = new ArrayList<>();

    public static String eliminarPesos(String precio){
        String charsToRemove = "$ (Preciofinal)";
        for (char c : charsToRemove.toCharArray()) {
            precio = precio.replace(String.valueOf(c), "");
        }
        return precio;
    }

    public static void setArrayProductos(String nombre, int cantidad, String precio){
        ProductoModel productoModel = new ProductoModel();
        productoModel.setNombre(nombre);
        productoModel.setCantidad(cantidad);
        productoModel.setPrecio(eliminarPesos(precio));
        productoModelsList.add(productoModel);
    }


    public static ArrayList<ProductoModel> getArrayProductos(){
        return productoModelsList;
    }

    public static int getCantidad(){
        return productoModelsList.size();
    }

    public static Integer getSumatoria(){
        int total = 0;
        for (int i = 0; i < productoModelsList.size(); i++) {
            total = total + getArrayProductos().get(i).getCantidad();
        }
        return total;
    }
}
