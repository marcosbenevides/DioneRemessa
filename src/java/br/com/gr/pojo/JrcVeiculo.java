package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcVeiculo generated by hbm2java
 */
public class JrcVeiculo  implements java.io.Serializable {


     private long idVeiculo;
     private JrcEmpresa jrcEmpresa;
     private JrcLocalidade jrcLocalidade;
     private JrcTipoVeiculo jrcTipoVeiculo;
     private JrcTransportador jrcTransportador;
     private JrcUsuario jrcUsuario;
     private JrcMotorista jrcMotorista;
     private String descBreve;
     private String descLonga;
     private String placa;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private String codigo;
     private String rntc;
     private Set jrcNotaFiscals = new HashSet(0);
     private Set jrcRecebimentos = new HashSet(0);

    public JrcVeiculo() {
    }

	
    public JrcVeiculo(long idVeiculo, JrcEmpresa jrcEmpresa, JrcLocalidade jrcLocalidade, JrcTipoVeiculo jrcTipoVeiculo, JrcTransportador jrcTransportador, JrcUsuario jrcUsuario, String descBreve, String placa, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String codigo) {
        this.idVeiculo = idVeiculo;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcLocalidade = jrcLocalidade;
        this.jrcTipoVeiculo = jrcTipoVeiculo;
        this.jrcTransportador = jrcTransportador;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.placa = placa;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.codigo = codigo;
    }
    public JrcVeiculo(long idVeiculo, JrcEmpresa jrcEmpresa, JrcLocalidade jrcLocalidade, JrcTipoVeiculo jrcTipoVeiculo, JrcTransportador jrcTransportador, JrcUsuario jrcUsuario, JrcMotorista jrcMotorista, String descBreve, String descLonga, String placa, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String codigo, String rntc, Set jrcNotaFiscals, Set jrcRecebimentos) {
       this.idVeiculo = idVeiculo;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcLocalidade = jrcLocalidade;
       this.jrcTipoVeiculo = jrcTipoVeiculo;
       this.jrcTransportador = jrcTransportador;
       this.jrcUsuario = jrcUsuario;
       this.jrcMotorista = jrcMotorista;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.placa = placa;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.codigo = codigo;
       this.rntc = rntc;
       this.jrcNotaFiscals = jrcNotaFiscals;
       this.jrcRecebimentos = jrcRecebimentos;
    }
   
    public long getIdVeiculo() {
        return this.idVeiculo;
    }
    
    public void setIdVeiculo(long idVeiculo) {
        this.idVeiculo = idVeiculo;
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
    public JrcTipoVeiculo getJrcTipoVeiculo() {
        return this.jrcTipoVeiculo;
    }
    
    public void setJrcTipoVeiculo(JrcTipoVeiculo jrcTipoVeiculo) {
        this.jrcTipoVeiculo = jrcTipoVeiculo;
    }
    public JrcTransportador getJrcTransportador() {
        return this.jrcTransportador;
    }
    
    public void setJrcTransportador(JrcTransportador jrcTransportador) {
        this.jrcTransportador = jrcTransportador;
    }
    public JrcUsuario getJrcUsuario() {
        return this.jrcUsuario;
    }
    
    public void setJrcUsuario(JrcUsuario jrcUsuario) {
        this.jrcUsuario = jrcUsuario;
    }
    public JrcMotorista getJrcMotorista() {
        return this.jrcMotorista;
    }
    
    public void setJrcMotorista(JrcMotorista jrcMotorista) {
        this.jrcMotorista = jrcMotorista;
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
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
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
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getRntc() {
        return this.rntc;
    }
    
    public void setRntc(String rntc) {
        this.rntc = rntc;
    }
    public Set getJrcNotaFiscals() {
        return this.jrcNotaFiscals;
    }
    
    public void setJrcNotaFiscals(Set jrcNotaFiscals) {
        this.jrcNotaFiscals = jrcNotaFiscals;
    }
    public Set getJrcRecebimentos() {
        return this.jrcRecebimentos;
    }
    
    public void setJrcRecebimentos(Set jrcRecebimentos) {
        this.jrcRecebimentos = jrcRecebimentos;
    }




}


