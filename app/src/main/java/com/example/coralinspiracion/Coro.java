package com.example.coralinspiracion;

public class Coro {
    private int logo;
    private String nombre;
    private String interpretes;

    public Coro(int logo, String nombre, String interpretes) {
        this.logo = logo;
        this.nombre = nombre;
        this.interpretes = interpretes;
    }

    // Getters
    public int getLogo() { return logo; }
    public String getNombre() { return nombre; }
    public String getInterpretes() { return interpretes; }

    // Setters
    public void setLogo(int logo) { this.logo = logo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setInterpretes(String interpretes) { this.interpretes = interpretes; }
}