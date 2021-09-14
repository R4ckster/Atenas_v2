package com.empresa.atenas.model;


import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Perfil")
public class PerfilModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;    
    private Date datacadastro;
    private boolean Ativo;

    public PerfilModel()
    {
    	
    }
    
    public PerfilModel(int id, String descricao, Date datacadastro, boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.datacadastro = datacadastro;
        Ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return datacadastro;
    }

    public void setDataCadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean ativo) {
        Ativo = ativo;
    }
}