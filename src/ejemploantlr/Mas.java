/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploantlr;

import apicreatorxml.Node;
import apicreatorxml.Paso;

/**
 *
 * @author adgao
 */
public class Mas {
    private Integer id;
    private Integer nivel;
    private Paso paso;
    private Node node;
    public Mas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Paso getPaso() {
        return paso;
    }

    public void setPaso(Paso paso) {
        this.paso = paso;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
    
}
