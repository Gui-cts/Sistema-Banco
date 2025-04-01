package banco;
//20 min aula teorica 5
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    public void openAccount(){
        
    }
    
    public void closeAccount(){
        
    }
    
    public void deposit(){
        
    }
    
    public void withdraw(){
        
    }
    
    public void payMonthly(){
        
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}


/*
tipo da conta ou CC ou CP
abrir conta muda status pra true e define o tipo
conta corrente ja ganha 50 pila / se for poupança ja ganha 150
pra fechar a conta nao pode ter saldo e nem debito
pra depositar e sacar a conta tem que estar aberta
sacar tem que ter saldo
pagar mensalidade cobrada diretamente do saldo
cc paga 12 e cp paga 20 de mensalidade


Algoritimo

Classe ContaBanco
//Atributos
publico numConta: Inteiro
protegido tipo: Caractere
privado dono: Caractere
privado saldo: Real
privado status: Logico
//metodos
publico Metedo abrirConta()

FimMetodo
publico Metodo fecharConta()

FimMetodo
publico metodo depositar()

FimMetodo
publico metodo sacar()

FimMetodo
//Metodos especiais

FimClasse
*/