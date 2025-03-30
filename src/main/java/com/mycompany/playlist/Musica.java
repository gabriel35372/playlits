/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playlist;

/**
 *
 * @author joseg
 */
class Musicas {
    String titulo;
    String album;
    String fecha;
    int duracion;
    
    public Musicas(String titulo, String album, String fecha, int duracion){
        this.titulo = titulo;
        this.album = album;
        this.fecha = fecha;
        this.duracion = duracion;    
    }
    
    public void ShowPlaylist(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Album: "+album);
        System.out.println("Fecha: "+ fecha);
        System.out.println("Duracion: "+ duracion);
    }
}