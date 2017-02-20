package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcAutorizadorNfe generated by hbm2java
 */
public class JrcAutorizadorNfe  implements java.io.Serializable {


     private long idAutorizadorNfe;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private String wsdlAutorizacaoNf;
     private String wsdlRetAutorizacaoNf;
     private String wsdlConsultaNf;
     private String wsdlInutilizacaoNf;
     private String wsdlCadastroNf;
     private String wsdlEventoNf;
     private String wsdlEpecEnvioNf;
     private String wsdlEpecConsultaNf;
     private Boolean indEnvioSincrono;
     private String wsdlAutorizacaoNfc;
     private String wsdlRetAutorizacaoNfc;
     private String wsdlConsultaNfc;
     private String wsdlInutilizacaoNfc;
     private String wsdlCadastroNfc;
     private String wsdlEventoNfc;
     private String wsdlEpecEnvioNfc;
     private String wsdlEpecConsultaNfc;
     private Boolean indEnvioCompactado;
     private Boolean indEnvioSincronoNfc;
     private Boolean indEnvioCompactadoNfc;
     private Set jrcUfs = new HashSet(0);

    public JrcAutorizadorNfe() {
    }

	
    public JrcAutorizadorNfe(long idAutorizadorNfe, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idAutorizadorNfe = idAutorizadorNfe;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcAutorizadorNfe(long idAutorizadorNfe, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String wsdlAutorizacaoNf, String wsdlRetAutorizacaoNf, String wsdlConsultaNf, String wsdlInutilizacaoNf, String wsdlCadastroNf, String wsdlEventoNf, String wsdlEpecEnvioNf, String wsdlEpecConsultaNf, Boolean indEnvioSincrono, String wsdlAutorizacaoNfc, String wsdlRetAutorizacaoNfc, String wsdlConsultaNfc, String wsdlInutilizacaoNfc, String wsdlCadastroNfc, String wsdlEventoNfc, String wsdlEpecEnvioNfc, String wsdlEpecConsultaNfc, Boolean indEnvioCompactado, Boolean indEnvioSincronoNfc, Boolean indEnvioCompactadoNfc, Set jrcUfs) {
       this.idAutorizadorNfe = idAutorizadorNfe;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.wsdlAutorizacaoNf = wsdlAutorizacaoNf;
       this.wsdlRetAutorizacaoNf = wsdlRetAutorizacaoNf;
       this.wsdlConsultaNf = wsdlConsultaNf;
       this.wsdlInutilizacaoNf = wsdlInutilizacaoNf;
       this.wsdlCadastroNf = wsdlCadastroNf;
       this.wsdlEventoNf = wsdlEventoNf;
       this.wsdlEpecEnvioNf = wsdlEpecEnvioNf;
       this.wsdlEpecConsultaNf = wsdlEpecConsultaNf;
       this.indEnvioSincrono = indEnvioSincrono;
       this.wsdlAutorizacaoNfc = wsdlAutorizacaoNfc;
       this.wsdlRetAutorizacaoNfc = wsdlRetAutorizacaoNfc;
       this.wsdlConsultaNfc = wsdlConsultaNfc;
       this.wsdlInutilizacaoNfc = wsdlInutilizacaoNfc;
       this.wsdlCadastroNfc = wsdlCadastroNfc;
       this.wsdlEventoNfc = wsdlEventoNfc;
       this.wsdlEpecEnvioNfc = wsdlEpecEnvioNfc;
       this.wsdlEpecConsultaNfc = wsdlEpecConsultaNfc;
       this.indEnvioCompactado = indEnvioCompactado;
       this.indEnvioSincronoNfc = indEnvioSincronoNfc;
       this.indEnvioCompactadoNfc = indEnvioCompactadoNfc;
       this.jrcUfs = jrcUfs;
    }
   
    public long getIdAutorizadorNfe() {
        return this.idAutorizadorNfe;
    }
    
    public void setIdAutorizadorNfe(long idAutorizadorNfe) {
        this.idAutorizadorNfe = idAutorizadorNfe;
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
    public String getWsdlAutorizacaoNf() {
        return this.wsdlAutorizacaoNf;
    }
    
    public void setWsdlAutorizacaoNf(String wsdlAutorizacaoNf) {
        this.wsdlAutorizacaoNf = wsdlAutorizacaoNf;
    }
    public String getWsdlRetAutorizacaoNf() {
        return this.wsdlRetAutorizacaoNf;
    }
    
    public void setWsdlRetAutorizacaoNf(String wsdlRetAutorizacaoNf) {
        this.wsdlRetAutorizacaoNf = wsdlRetAutorizacaoNf;
    }
    public String getWsdlConsultaNf() {
        return this.wsdlConsultaNf;
    }
    
    public void setWsdlConsultaNf(String wsdlConsultaNf) {
        this.wsdlConsultaNf = wsdlConsultaNf;
    }
    public String getWsdlInutilizacaoNf() {
        return this.wsdlInutilizacaoNf;
    }
    
    public void setWsdlInutilizacaoNf(String wsdlInutilizacaoNf) {
        this.wsdlInutilizacaoNf = wsdlInutilizacaoNf;
    }
    public String getWsdlCadastroNf() {
        return this.wsdlCadastroNf;
    }
    
    public void setWsdlCadastroNf(String wsdlCadastroNf) {
        this.wsdlCadastroNf = wsdlCadastroNf;
    }
    public String getWsdlEventoNf() {
        return this.wsdlEventoNf;
    }
    
    public void setWsdlEventoNf(String wsdlEventoNf) {
        this.wsdlEventoNf = wsdlEventoNf;
    }
    public String getWsdlEpecEnvioNf() {
        return this.wsdlEpecEnvioNf;
    }
    
    public void setWsdlEpecEnvioNf(String wsdlEpecEnvioNf) {
        this.wsdlEpecEnvioNf = wsdlEpecEnvioNf;
    }
    public String getWsdlEpecConsultaNf() {
        return this.wsdlEpecConsultaNf;
    }
    
    public void setWsdlEpecConsultaNf(String wsdlEpecConsultaNf) {
        this.wsdlEpecConsultaNf = wsdlEpecConsultaNf;
    }
    public Boolean getIndEnvioSincrono() {
        return this.indEnvioSincrono;
    }
    
    public void setIndEnvioSincrono(Boolean indEnvioSincrono) {
        this.indEnvioSincrono = indEnvioSincrono;
    }
    public String getWsdlAutorizacaoNfc() {
        return this.wsdlAutorizacaoNfc;
    }
    
    public void setWsdlAutorizacaoNfc(String wsdlAutorizacaoNfc) {
        this.wsdlAutorizacaoNfc = wsdlAutorizacaoNfc;
    }
    public String getWsdlRetAutorizacaoNfc() {
        return this.wsdlRetAutorizacaoNfc;
    }
    
    public void setWsdlRetAutorizacaoNfc(String wsdlRetAutorizacaoNfc) {
        this.wsdlRetAutorizacaoNfc = wsdlRetAutorizacaoNfc;
    }
    public String getWsdlConsultaNfc() {
        return this.wsdlConsultaNfc;
    }
    
    public void setWsdlConsultaNfc(String wsdlConsultaNfc) {
        this.wsdlConsultaNfc = wsdlConsultaNfc;
    }
    public String getWsdlInutilizacaoNfc() {
        return this.wsdlInutilizacaoNfc;
    }
    
    public void setWsdlInutilizacaoNfc(String wsdlInutilizacaoNfc) {
        this.wsdlInutilizacaoNfc = wsdlInutilizacaoNfc;
    }
    public String getWsdlCadastroNfc() {
        return this.wsdlCadastroNfc;
    }
    
    public void setWsdlCadastroNfc(String wsdlCadastroNfc) {
        this.wsdlCadastroNfc = wsdlCadastroNfc;
    }
    public String getWsdlEventoNfc() {
        return this.wsdlEventoNfc;
    }
    
    public void setWsdlEventoNfc(String wsdlEventoNfc) {
        this.wsdlEventoNfc = wsdlEventoNfc;
    }
    public String getWsdlEpecEnvioNfc() {
        return this.wsdlEpecEnvioNfc;
    }
    
    public void setWsdlEpecEnvioNfc(String wsdlEpecEnvioNfc) {
        this.wsdlEpecEnvioNfc = wsdlEpecEnvioNfc;
    }
    public String getWsdlEpecConsultaNfc() {
        return this.wsdlEpecConsultaNfc;
    }
    
    public void setWsdlEpecConsultaNfc(String wsdlEpecConsultaNfc) {
        this.wsdlEpecConsultaNfc = wsdlEpecConsultaNfc;
    }
    public Boolean getIndEnvioCompactado() {
        return this.indEnvioCompactado;
    }
    
    public void setIndEnvioCompactado(Boolean indEnvioCompactado) {
        this.indEnvioCompactado = indEnvioCompactado;
    }
    public Boolean getIndEnvioSincronoNfc() {
        return this.indEnvioSincronoNfc;
    }
    
    public void setIndEnvioSincronoNfc(Boolean indEnvioSincronoNfc) {
        this.indEnvioSincronoNfc = indEnvioSincronoNfc;
    }
    public Boolean getIndEnvioCompactadoNfc() {
        return this.indEnvioCompactadoNfc;
    }
    
    public void setIndEnvioCompactadoNfc(Boolean indEnvioCompactadoNfc) {
        this.indEnvioCompactadoNfc = indEnvioCompactadoNfc;
    }
    public Set getJrcUfs() {
        return this.jrcUfs;
    }
    
    public void setJrcUfs(Set jrcUfs) {
        this.jrcUfs = jrcUfs;
    }




}

