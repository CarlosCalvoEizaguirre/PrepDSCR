package es.unavarra.tlm.pseudoexamen2024peticionesanidadas;

import java.util.List;
/*
 * ============================================================================
 * MODELO: ComponentsResponse.java
 * ============================================================================
 *
 * Respuesta del servidor al pedir los componentes.
 *
 * JSON:
 * {
 *   "components": [
 *     { "id": "...", "name": "...", "price": ... },
 *     ...
 *   ]
 * }
 */
public class ComponentsResponse {
    private List<Component> components;

    public List<Component> getComponents() {
        return components;
    }
}
