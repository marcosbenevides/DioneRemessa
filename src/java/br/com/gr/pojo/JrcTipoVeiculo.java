package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTipoVeiculo generated by hbm2java
 */
public class JrcTipoVeiculo  implements java.io.Serializable {


     private long idTipoVeiculo;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private BigDecimal pesoCapacidade;
     private BigDecimal comprimentoCapacidade;
     private BigDecimal larguraCapacidade;
     private BigDecimal alturaCapacidade;
     private BigDecimal volumeCapacidade;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private boolean indAtivo;
     private String flagProcesso;
     private Short minAgendaRec;
     private Short carQtdeMin;
     private Short carQtdeMax;
     private BigDecimal carPesoMin;
     private BigDecimal carPesoMax;
     private BigDecimal carVolumeMin;
     private BigDecimal carVolumeMax;
     private Set jrcVeiculos = new HashSet(0);
     private Set jrcRecebimentos = new HashSet(0);

    public JrcTipoVeiculo() {
    }

	
    public JrcTipoVeiculo(long idTipoVeiculo, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, BigDecimal pesoCapacidade, BigDecimal comprimentoCapacidade, BigDecimal larguraCapacidade, BigDecimal alturaCapacidade, BigDecimal volumeCapacidade, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, boolean indAtivo, String flagProcesso) {
        this.idTipoVeiculo = idTipoVeiculo;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.pesoCapacidade = pesoCapacidade;
        this.comprimentoCapacidade = comprimentoCapacidade;
        this.larguraCapacidade = larguraCapacidade;
        this.alturaCapacidade = alturaCapacidade;
        this.volumeCapacidade = volumeCapacidade;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.indAtivo = indAtivo;
        this.flagProcesso = flagProcesso;
    }
    public JrcTipoVeiculo(long idTipoVeiculo, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, BigDecimal pesoCapacidade, BigDecimal comprimentoCapacidade, BigDecimal larguraCapacidade, BigDecimal alturaCapacidade, BigDecimal volumeCapacidade, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, boolean indAtivo, String flagProcesso, Short minAgendaRec, Short carQtdeMin, Short carQtdeMax, BigDecimal carPesoMin, BigDecimal carPesoMax, BigDecimal carVolumeMin, BigDecimal carVolumeMax, Set jrcVeiculos, Set jrcRecebimentos) {
       this.idTipoVeiculo = idTipoVeiculo;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.pesoCapacidade = pesoCapacidade;
       this.comprimentoCapacidade = comprimentoCapacidade;
       this.larguraCapacidade = larguraCapacidade;
       this.alturaCapacidade = alturaCapacidade;
       this.volumeCapacidade = volumeCapacidade;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.indAtivo = indAtivo;
       this.flagProcesso = flagProcesso;
       this.minAgendaRec = minAgendaRec;
       this.carQtdeMin = carQtdeMin;
       this.carQtdeMax = carQtdeMax;
       this.carPesoMin = carPesoMin;
       this.carPesoMax = carPesoMax;
       this.carVolumeMin = carVolumeMin;
       this.carVolumeMax = carVolumeMax;
       this.jrcVeiculos = jrcVeiculos;
       this.jrcRecebimentos = jrcRecebimentos;
    }
   
    public long getIdTipoVeiculo() {
        return this.idTipoVeiculo;
    }
    
    public void setIdTipoVeiculo(long idTipoVeiculo) {
        this.idTipoVeiculo = idTipoVeiculo;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
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
    public BigDecimal getPesoCapacidade() {
        return this.pesoCapacidade;
    }
    
    public void setPesoCapacidade(BigDecimal pesoCapacidade) {
        this.pesoCapacidade = pesoCapacidade;
    }
    public BigDecimal getComprimentoCapacidade() {
        return this.comprimentoCapacidade;
    }
    
    public void setComprimentoCapacidade(BigDecimal comprimentoCapacidade) {
        this.comprimentoCapacidade = comprimentoCapacidade;
    }
    public BigDecimal getLarguraCapacidade() {
        return this.larguraCapacidade;
    }
    
    public void setLarguraCapacidade(BigDecimal larguraCapacidade) {
        this.larguraCapacidade = larguraCapacidade;
    }
    public BigDecimal getAlturaCapacidade() {
        return this.alturaCapacidade;
    }
    
    public void setAlturaCapacidade(BigDecimal alturaCapacidade) {
        this.alturaCapacidade = alturaCapacidade;
    }
    public BigDecimal getVolumeCapacidade() {
        return this.volumeCapacidade;
    }
    
    public void setVolumeCapacidade(BigDecimal volumeCapacidade) {
        this.volumeCapacidade = volumeCapacidade;
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
    public boolean isIndAtivo() {
        return this.indAtivo;
    }
    
    public void setIndAtivo(boolean indAtivo) {
        this.indAtivo = indAtivo;
    }
    public String getFlagProcesso() {
        return this.flagProcesso;
    }
    
    public void setFlagProcesso(String flagProcesso) {
        this.flagProcesso = flagProcesso;
    }
    public Short getMinAgendaRec() {
        return this.minAgendaRec;
    }
    
    public void setMinAgendaRec(Short minAgendaRec) {
        this.minAgendaRec = minAgendaRec;
    }
    public Short getCarQtdeMin() {
        return this.carQtdeMin;
    }
    
    public void setCarQtdeMin(Short carQtdeMin) {
        this.carQtdeMin = carQtdeMin;
    }
    public Short getCarQtdeMax() {
        return this.carQtdeMax;
    }
    
    public void setCarQtdeMax(Short carQtdeMax) {
        this.carQtdeMax = carQtdeMax;
    }
    public BigDecimal getCarPesoMin() {
        return this.carPesoMin;
    }
    
    public void setCarPesoMin(BigDecimal carPesoMin) {
        this.carPesoMin = carPesoMin;
    }
    public BigDecimal getCarPesoMax() {
        return this.carPesoMax;
    }
    
    public void setCarPesoMax(BigDecimal carPesoMax) {
        this.carPesoMax = carPesoMax;
    }
    public BigDecimal getCarVolumeMin() {
        return this.carVolumeMin;
    }
    
    public void setCarVolumeMin(BigDecimal carVolumeMin) {
        this.carVolumeMin = carVolumeMin;
    }
    public BigDecimal getCarVolumeMax() {
        return this.carVolumeMax;
    }
    
    public void setCarVolumeMax(BigDecimal carVolumeMax) {
        this.carVolumeMax = carVolumeMax;
    }
    public Set getJrcVeiculos() {
        return this.jrcVeiculos;
    }
    
    public void setJrcVeiculos(Set jrcVeiculos) {
        this.jrcVeiculos = jrcVeiculos;
    }
    public Set getJrcRecebimentos() {
        return this.jrcRecebimentos;
    }
    
    public void setJrcRecebimentos(Set jrcRecebimentos) {
        this.jrcRecebimentos = jrcRecebimentos;
    }




}

