package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcLocalidade generated by hbm2java
 */
public class JrcLocalidade  implements java.io.Serializable {


     private long idLocalidade;
     private JrcEmpresa jrcEmpresa;
     private JrcUf jrcUf;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private Integer cep;
     private boolean indCepLocalidade;
     private Integer chaveDne;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private String flagTipoLocalidade;
     private Integer codIbge;
     private String codMmaq;
     private Set jrcNotaFiscalsForEmIdLocalidade = new HashSet(0);
     private Set jrcVeiculos = new HashSet(0);
     private Set jrcNotaFiscalsForDrIdLocalidade = new HashSet(0);
     private Set jrcNotaFiscalsForTrIdLocalidade = new HashSet(0);
     private Set jrcBairros = new HashSet(0);
     private Set jrcLogradouros = new HashSet(0);
     private Set jrcPedidoVendas = new HashSet(0);

    public JrcLocalidade() {
    }

	
    public JrcLocalidade(long idLocalidade, JrcEmpresa jrcEmpresa, JrcUf jrcUf, JrcUsuario jrcUsuario, String descLonga, boolean indCepLocalidade, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String flagTipoLocalidade) {
        this.idLocalidade = idLocalidade;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUf = jrcUf;
        this.jrcUsuario = jrcUsuario;
        this.descLonga = descLonga;
        this.indCepLocalidade = indCepLocalidade;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.flagTipoLocalidade = flagTipoLocalidade;
    }
    public JrcLocalidade(long idLocalidade, JrcEmpresa jrcEmpresa, JrcUf jrcUf, JrcUsuario jrcUsuario, String descBreve, String descLonga, Integer cep, boolean indCepLocalidade, Integer chaveDne, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String flagTipoLocalidade, Integer codIbge, String codMmaq, Set jrcNotaFiscalsForEmIdLocalidade, Set jrcVeiculos, Set jrcNotaFiscalsForDrIdLocalidade, Set jrcNotaFiscalsForTrIdLocalidade, Set jrcBairros, Set jrcLogradouros, Set jrcPedidoVendas) {
       this.idLocalidade = idLocalidade;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUf = jrcUf;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.cep = cep;
       this.indCepLocalidade = indCepLocalidade;
       this.chaveDne = chaveDne;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.flagTipoLocalidade = flagTipoLocalidade;
       this.codIbge = codIbge;
       this.codMmaq = codMmaq;
       this.jrcNotaFiscalsForEmIdLocalidade = jrcNotaFiscalsForEmIdLocalidade;
       this.jrcVeiculos = jrcVeiculos;
       this.jrcNotaFiscalsForDrIdLocalidade = jrcNotaFiscalsForDrIdLocalidade;
       this.jrcNotaFiscalsForTrIdLocalidade = jrcNotaFiscalsForTrIdLocalidade;
       this.jrcBairros = jrcBairros;
       this.jrcLogradouros = jrcLogradouros;
       this.jrcPedidoVendas = jrcPedidoVendas;
    }
   
    public long getIdLocalidade() {
        return this.idLocalidade;
    }
    
    public void setIdLocalidade(long idLocalidade) {
        this.idLocalidade = idLocalidade;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcUf getJrcUf() {
        return this.jrcUf;
    }
    
    public void setJrcUf(JrcUf jrcUf) {
        this.jrcUf = jrcUf;
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
    public Integer getCep() {
        return this.cep;
    }
    
    public void setCep(Integer cep) {
        this.cep = cep;
    }
    public boolean isIndCepLocalidade() {
        return this.indCepLocalidade;
    }
    
    public void setIndCepLocalidade(boolean indCepLocalidade) {
        this.indCepLocalidade = indCepLocalidade;
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
    public String getFlagTipoLocalidade() {
        return this.flagTipoLocalidade;
    }
    
    public void setFlagTipoLocalidade(String flagTipoLocalidade) {
        this.flagTipoLocalidade = flagTipoLocalidade;
    }
    public Integer getCodIbge() {
        return this.codIbge;
    }
    
    public void setCodIbge(Integer codIbge) {
        this.codIbge = codIbge;
    }
    public String getCodMmaq() {
        return this.codMmaq;
    }
    
    public void setCodMmaq(String codMmaq) {
        this.codMmaq = codMmaq;
    }
    public Set getJrcNotaFiscalsForEmIdLocalidade() {
        return this.jrcNotaFiscalsForEmIdLocalidade;
    }
    
    public void setJrcNotaFiscalsForEmIdLocalidade(Set jrcNotaFiscalsForEmIdLocalidade) {
        this.jrcNotaFiscalsForEmIdLocalidade = jrcNotaFiscalsForEmIdLocalidade;
    }
    public Set getJrcVeiculos() {
        return this.jrcVeiculos;
    }
    
    public void setJrcVeiculos(Set jrcVeiculos) {
        this.jrcVeiculos = jrcVeiculos;
    }
    public Set getJrcNotaFiscalsForDrIdLocalidade() {
        return this.jrcNotaFiscalsForDrIdLocalidade;
    }
    
    public void setJrcNotaFiscalsForDrIdLocalidade(Set jrcNotaFiscalsForDrIdLocalidade) {
        this.jrcNotaFiscalsForDrIdLocalidade = jrcNotaFiscalsForDrIdLocalidade;
    }
    public Set getJrcNotaFiscalsForTrIdLocalidade() {
        return this.jrcNotaFiscalsForTrIdLocalidade;
    }
    
    public void setJrcNotaFiscalsForTrIdLocalidade(Set jrcNotaFiscalsForTrIdLocalidade) {
        this.jrcNotaFiscalsForTrIdLocalidade = jrcNotaFiscalsForTrIdLocalidade;
    }
    public Set getJrcBairros() {
        return this.jrcBairros;
    }
    
    public void setJrcBairros(Set jrcBairros) {
        this.jrcBairros = jrcBairros;
    }
    public Set getJrcLogradouros() {
        return this.jrcLogradouros;
    }
    
    public void setJrcLogradouros(Set jrcLogradouros) {
        this.jrcLogradouros = jrcLogradouros;
    }
    public Set getJrcPedidoVendas() {
        return this.jrcPedidoVendas;
    }
    
    public void setJrcPedidoVendas(Set jrcPedidoVendas) {
        this.jrcPedidoVendas = jrcPedidoVendas;
    }




}


