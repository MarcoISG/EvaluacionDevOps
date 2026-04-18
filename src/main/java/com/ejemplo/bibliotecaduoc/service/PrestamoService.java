package com.ejemplo.bibliotecaduoc.service;

import com.ejemplo.bibliotecaduoc.model.Prestamo;
import com.ejemplo.bibliotecaduoc.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository repository;

    public List<Prestamo> obtenerPrestamos() {
        return repository.obtenerPrestamos();
    }

    public Prestamo buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    public Prestamo guardar(Prestamo prestamo) {
        return repository.guardar(prestamo);
    }

    public Prestamo actualizar(int id, Prestamo prestamo) {
        return repository.actualizar(id, prestamo);
    }

    public boolean eliminar(int id) {
        return repository.eliminar(id);
    }
}