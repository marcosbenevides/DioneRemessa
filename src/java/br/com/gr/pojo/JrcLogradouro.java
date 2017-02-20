package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcLogradouro generated by hbm2java
 */
public class JrcLogradouro  implements java.io.Serializable {


     private long idLogradouro;
     private JrcBairro jrcBairro;
     private JrcEmpresa jrcEmpresa;
     private JrcLocalidade jrcLocalidade;
     private JrcTipoLogradouro jrcTipoLogradouro;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private Integer chaveDne;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Integer cep;
     private Set jrcNotaFiscalsForTrIdLogradouro = new HashSet(0);
     private Set jrcPedidoVendas = new HashSet(0);
     private Set jrcNotaFiscalsForEmIdLogradouro = new HashSet(0);
     private Set jrcNotaFiscalsForDrIdLogradouro = new HashSet(0);

    public JrcLogradouro() {
    }

	
    public JrcLogradouro(long idLogradouro, JrcBairro jrcBairro, JrcEmpresa jrcEmpresa, JrcLocalidade jrcLocalidade, JrcTipoLogradouro jrcTipoLogradouro, JrcUsuario jrcUsuario, String descLonga, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idLogradouro = idLogradouro;
        this.jrcBairro = jrcBairro;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcLocalidade = jrcLocalidade;
        this.jrcTipoLogradouro = jrcTipoLogradouro;
        this.jrcUsuario = jrcUsuario;
        this.descLonga = descLonga;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcLogradouro(long idLogradouro, JrcBairro jrcBairro, JrcEmpresa jrcEmpresa, JrcLocalidade jrcLocalidade, JrcTipoLogradouro jrcTipoLogradouro, JrcUsuario jrcUsuario, String descBreve, String descLonga, Integer chaveDne, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Integer cep, Set jrcNotaFiscalsForTrIdLogradouro, Set jrcPedidoVendas, Set jrcNotaFiscalsForEmIdLogradouro, Set jrcNotaFiscalsForDrIdLogradouro) {
       this.idLogradouro = idLogradouro;
       this.jrcBairro = jrcBairro;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcLocalidade = jrcLocalidade;
       this.jrcTipoLogradouro = jrcTipoLogradouro;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.chaveDne = chaveDne;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.cep = cep;
       this.jrcNotaFiscalsForTrIdLogradouro = jrcNotaFiscalsForTrIdLogradouro;
       this.jrcPedidoVendas = jrcPedidoVendas;
       this.jrcNotaFiscalsForEmIdLogradouro = jrcNotaFiscalsForEmIdLogradouro;
       this.jrcNotaFiscalsForDrIdLogradouro = jrcNotaFiscalsForDrIdLogradouro;
    }
   
    public long getIdLogradouro() {
        return this.idLogradouro;
    }
    
    public void setIdLogradouro(long idLogradouro) {
        this.idLogradouro = idLogradouro;
    }
    public JrcBairro getJrcBairro() {
        return this.jrcBairro;
    }
    
    public void setJrcBairro(JrcBairro jrcBairro) {
        this.jrcBairro = jrcBairro;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcLocalidade getJrcLocalidade() {
        return this.jrcLocalidade;
    }
    
    public void setJrcLocalidade(JrcLocalidade jrcLocalidade) {
        this.jrcLocalidade = jrcLocalidade;
    }
    public JrcTipoLogradouro getJrcTipoLogradouro() {
        return this.jrcTipoLogradouro;
    }
    
    public void setJrcTipoLogradouro(JrcTipoLogradouro jrcTipoLogradouro) {
        this.jrcTipoLogradouro = jrcTipoLogradouro;
    }
    public JrcUsuario getJrcUsuario() {
        return this.jrcUsuario;
    }
    
    public void setJrcUsuario(JrcUsuario jrcUsuario) {
        this.jrcUsuario = jrcUsuario;
    }
    public String getDescBreve() {
        return this.descBreve;
    }
    
    public void setDescBreve(String descBreve) {
        this.descBreve = descBreve;
    }
    public String getDescLonga() {
        return this.descLonga;
    }
    
    public void setDescLonga(String descLonga) {
        this.descLonga = descLonga;
    }
    public Integer getChaveDne() {
        return this.chaveDne;
    }
    
    public void setChaveDne(Integer chaveDne) {
        this.chaveDne = chaveDne;
    }
    public Date getDtInicioPeriodo() {
        return this.dtInicioPeriodo;
    }
    
    public void setDtInicioPeriodo(Date dtInicioPeriodo) {
        this.dtInicioPeriodo = dtInicioPeriodo;
    }
    public Date getDtFimPeriodo() {
        return this.dtFimPeriodo;
    }
    
    public void setDtFimPeriodo(Date dtFimPeriodo) {
        this.dtFimPeriodo = dtFimPeriodo;
    }
    public Date getDtInclusao() {
        return this.dtInclusao;
    }
    
    public void setDtInclusao(Date dtInclusao) {
        this.dtInclusao = dtInclusao;
    }
    public Date getDtAlteracao() {
        return this.dtAlteracao;
    }
    
    public void setDtAlteracao(Date dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }
    public long getVersaoSistema() {
        return this.versaoSistema;
    }
    
    public void setVersaoSistema(long versaoSistema) {
        this.versaoSistema = versaoSistema;
    }
    public long getVersaoRegistro() {
        return this.versaoRegistro;
    }
    
    public void setVersaoRegistro(long versaoRegistro) {
        this.versaoRegistro = versaoRegistro;
    }
    public Integer getCep() {
        return this.cep;
    }
    
    public void setCep(Integer cep) {
        this.cep = cep;
    }
    public Set getJrcNotaFiscalsForTrIdLogradouro() {
        return this.jrcNotaFiscalsForTrIdLogradouro;
    }
    
    public void setJrcNotaFiscalsForTrIdLogradouro(Set jrcNotaFiscalsForTrIdLogradouro) {
        this.jrcNotaFiscalsForTrIdLogradouro = jrcNotaFiscalsForTrIdLogradouro;
    }
    public Set getJrcPedidoVendas() {
        return this.jrcPedidoVendas;
    }
    
    public void setJrcPedidoVendas(Set jrcPedidoVendas) {
        this.jrcPedidoVendas = jrcPedidoVendas;
    }
    public Set getJrcNotaFiscalsForEmIdLogradouro() {
        return this.jrcNotaFiscalsForEmIdLogradouro;
    }
    
    public void setJrcNotaFiscalsForEmIdLogradouro(Set jrcNotaFiscalsForEmIdLogradouro) {
        this.jrcNotaFiscalsForEmIdLogradouro = jrcNotaFiscalsForEmIdLogradouro;
    }
    public Set getJrcNotaFiscalsForDrIdLogradouro() {
        return this.jrcNotaFiscalsForDrIdLogradouro;
    }
    
    public void setJrcNotaFiscalsForDrIdLogradouro(Set jrcNotaFiscalsForDrIdLogradouro) {
        this.jrcNotaFiscalsForDrIdLogradouro = jrcNotaFiscalsForDrIdLogradouro;
    }




}

