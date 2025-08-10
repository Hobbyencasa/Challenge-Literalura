package com.aluracursos.literalura.challenge;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
