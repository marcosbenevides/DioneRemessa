package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1



/**
 * JrcPessoaBancoId generated by hbm2java
 */
public class JrcPessoaBancoId  implements java.io.Serializable {


     private long idPessoa;
     private short sequencial;

    public JrcPessoaBancoId() {
    }

    public JrcPessoaBancoId(long idPessoa, short sequencial) {
       this.idPessoa = idPessoa;
       this.sequencial = sequencial;
    }
   
    public long getIdPessoa() {
        return this.idPessoa;
    }
    
    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
    public short getSequencial() {
        return this.sequencial;
    }
    
    public void setSequencial(short sequencial) {
        this.sequencial = sequencial;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof JrcPessoaBancoId) ) return false;
		 JrcPessoaBancoId castOther = ( JrcPessoaBancoId ) other; 
         
		 return (this.getIdPessoa()==castOther.getIdPessoa())
 && (this.getSequencial()==castOther.getSequencial());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getIdPessoa();
         result = 37 * result + this.getSequencial();
         return result;
   }   


}


