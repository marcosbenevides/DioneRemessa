package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcPlanoFinanciamento generated by hbm2java
 */
public class JrcPlanoFinanciamento  implements java.io.Serializable {


     private long idPlanoFinanciamento;
     private JrcEmpresa jrcEmpresa;
     private JrcTabelaFinanciamento jrcTabelaFinanciamento;
     private JrcUsuario jrcUsuario;
     private boolean indPlanoComEntrada;
     private short plano;
     private Short carenciaIntervalo;
     private boolean indCarenciaZero;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private BigDecimal taxaNominal;
     private BigDecimal taxaEfetiva;
     private BigDecimal taxaNominalReversao;
     private BigDecimal taxaEfetivaReversao;
     private String flagTipoPagtoTef;
     private BigDecimal taxaEfetivaMin;
     private BigDecimal taxaEfetivaMax;
     private Short carenciaMin;
     private Short carenciaMax;
     private BigDecimal taxaRetencao;
     private BigDecimal percEntradaMin;
     private Boolean indCarenciaSemJuros;
     private BigDecimal taxaAdm;
     private Set jrcPromocaoItems = new HashSet(0);
     private Set jrcPromocaoGerals = new HashSet(0);

    public JrcPlanoFinanciamento() {
    }

	
    public JrcPlanoFinanciamento(long idPlanoFinanciamento, JrcEmpresa jrcEmpresa, JrcTabelaFinanciamento jrcTabelaFinanciamento, JrcUsuario jrcUsuario, boolean indPlanoComEntrada, short plano, boolean indCarenciaZero, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, BigDecimal taxaNominal, BigDecimal taxaEfetiva) {
        this.idPlanoFinanciamento = idPlanoFinanciamento;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcTabelaFinanciamento = jrcTabelaFinanciamento;
        this.jrcUsuario = jrcUsuario;
        this.indPlanoComEntrada = indPlanoComEntrada;
        this.plano = plano;
        this.indCarenciaZero = indCarenciaZero;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.taxaNominal = taxaNominal;
        this.taxaEfetiva = taxaEfetiva;
    }
    public JrcPlanoFinanciamento(long idPlanoFinanciamento, JrcEmpresa jrcEmpresa, JrcTabelaFinanciamento jrcTabelaFinanciamento, JrcUsuario jrcUsuario, boolean indPlanoComEntrada, short plano, Short carenciaIntervalo, boolean indCarenciaZero, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, BigDecimal taxaNominal, BigDecimal taxaEfetiva, BigDecimal taxaNominalReversao, BigDecimal taxaEfetivaReversao, String flagTipoPagtoTef, BigDecimal taxaEfetivaMin, BigDecimal taxaEfetivaMax, Short carenciaMin, Short carenciaMax, BigDecimal taxaRetencao, BigDecimal percEntradaMin, Boolean indCarenciaSemJuros, BigDecimal taxaAdm, Set jrcPromocaoItems, Set jrcPromocaoGerals) {
       this.idPlanoFinanciamento = idPlanoFinanciamento;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcTabelaFinanciamento = jrcTabelaFinanciamento;
       this.jrcUsuario = jrcUsuario;
       this.indPlanoComEntrada = indPlanoComEntrada;
       this.plano = plano;
       this.carenciaIntervalo = carenciaIntervalo;
       this.indCarenciaZero = indCarenciaZero;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.taxaNominal = taxaNominal;
       this.taxaEfetiva = taxaEfetiva;
       this.taxaNominalReversao = taxaNominalReversao;
       this.taxaEfetivaReversao = taxaEfetivaReversao;
       this.flagTipoPagtoTef = flagTipoPagtoTef;
       this.taxaEfetivaMin = taxaEfetivaMin;
       this.taxaEfetivaMax = taxaEfetivaMax;
       this.carenciaMin = carenciaMin;
       this.carenciaMax = carenciaMax;
       this.taxaRetencao = taxaRetencao;
       this.percEntradaMin = percEntradaMin;
       this.indCarenciaSemJuros = indCarenciaSemJuros;
       this.taxaAdm = taxaAdm;
       this.jrcPromocaoItems = jrcPromocaoItems;
       this.jrcPromocaoGerals = jrcPromocaoGerals;
    }
   
    public long getIdPlanoFinanciamento() {
        return this.idPlanoFinanciamento;
    }
    
    public void setIdPlanoFinanciamento(long idPlanoFinanciamento) {
        this.idPlanoFinanciamento = idPlanoFinanciamento;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcTabelaFinanciamento getJrcTabelaFinanciamento() {
        return this.jrcTabelaFinanciamento;
    }
    
    public void setJrcTabelaFinanciamento(JrcTabelaFinanciamento jrcTabelaFinanciamento) {
        this.jrcTabelaFinanciamento = jrcTabelaFinanciamento;
    }
    public JrcUsuario getJrcUsuario() {
        return this.jrcUsuario;
    }
    
    public void setJrcUsuario(JrcUsuario jrcUsuario) {
        this.jrcUsuario = jrcUsuario;
    }
    public boolean isIndPlanoComEntrada() {
        return this.indPlanoComEntrada;
    }
    
    public void setIndPlanoComEntrada(boolean indPlanoComEntrada) {
        this.indPlanoComEntrada = indPlanoComEntrada;
    }
    public short getPlano() {
        return this.plano;
    }
    
    public void setPlano(short plano) {
        this.plano = plano;
    }
    public Short getCarenciaIntervalo() {
        return this.carenciaIntervalo;
    }
    
    public void setCarenciaIntervalo(Short carenciaIntervalo) {
        this.carenciaIntervalo = carenciaIntervalo;
    }
    public boolean isIndCarenciaZero() {
        return this.indCarenciaZero;
    }
    
    public void setIndCarenciaZero(boolean indCarenciaZero) {
        this.indCarenciaZero = indCarenciaZero;
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
    public BigDecimal getTaxaNominal() {
        return this.taxaNominal;
    }
    
    public void setTaxaNominal(BigDecimal taxaNominal) {
        this.taxaNominal = taxaNominal;
    }
    public BigDecimal getTaxaEfetiva() {
        return this.taxaEfetiva;
    }
    
    public void setTaxaEfetiva(BigDecimal taxaEfetiva) {
        this.taxaEfetiva = taxaEfetiva;
    }
    public BigDecimal getTaxaNominalReversao() {
        return this.taxaNominalReversao;
    }
    
    public void setTaxaNominalReversao(BigDecimal taxaNominalReversao) {
        this.taxaNominalReversao = taxaNominalReversao;
    }
    public BigDecimal getTaxaEfetivaReversao() {
        return this.taxaEfetivaReversao;
    }
    
    public void setTaxaEfetivaReversao(BigDecimal taxaEfetivaReversao) {
        this.taxaEfetivaReversao = taxaEfetivaReversao;
    }
    public String getFlagTipoPagtoTef() {
        return this.flagTipoPagtoTef;
    }
    
    public void setFlagTipoPagtoTef(String flagTipoPagtoTef) {
        this.flagTipoPagtoTef = flagTipoPagtoTef;
    }
    public BigDecimal getTaxaEfetivaMin() {
        return this.taxaEfetivaMin;
    }
    
    public void setTaxaEfetivaMin(BigDecimal taxaEfetivaMin) {
        this.taxaEfetivaMin = taxaEfetivaMin;
    }
    public BigDecimal getTaxaEfetivaMax() {
        return this.taxaEfetivaMax;
    }
    
    public void setTaxaEfetivaMax(BigDecimal taxaEfetivaMax) {
        this.taxaEfetivaMax = taxaEfetivaMax;
    }
    public Short getCarenciaMin() {
        return this.carenciaMin;
    }
    
    public void setCarenciaMin(Short carenciaMin) {
        this.carenciaMin = carenciaMin;
    }
    public Short getCarenciaMax() {
        return this.carenciaMax;
    }
    
    public void setCarenciaMax(Short carenciaMax) {
        this.carenciaMax = carenciaMax;
    }
    public BigDecimal getTaxaRetencao() {
        return this.taxaRetencao;
    }
    
    public void setTaxaRetencao(BigDecimal taxaRetencao) {
        this.taxaRetencao = taxaRetencao;
    }
    public BigDecimal getPercEntradaMin() {
        return this.percEntradaMin;
    }
    
    public void setPercEntradaMin(BigDecimal percEntradaMin) {
        this.percEntradaMin = percEntradaMin;
    }
    public Boolean getIndCarenciaSemJuros() {
        return this.indCarenciaSemJuros;
    }
    
    public void setIndCarenciaSemJuros(Boolean indCarenciaSemJuros) {
        this.indCarenciaSemJuros = indCarenciaSemJuros;
    }
    public BigDecimal getTaxaAdm() {
        return this.taxaAdm;
    }
    
    public void setTaxaAdm(BigDecimal taxaAdm) {
        this.taxaAdm = taxaAdm;
    }
    public Set getJrcPromocaoItems() {
        return this.jrcPromocaoItems;
    }
    
    public void setJrcPromocaoItems(Set jrcPromocaoItems) {
        this.jrcPromocaoItems = jrcPromocaoItems;
    }
    public Set getJrcPromocaoGerals() {
        return this.jrcPromocaoGerals;
    }
    
    public void setJrcPromocaoGerals(Set jrcPromocaoGerals) {
        this.jrcPromocaoGerals = jrcPromocaoGerals;
    }




}


